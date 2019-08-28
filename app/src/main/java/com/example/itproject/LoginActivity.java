package com.example.itproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.itproject.Model.Users;
import com.example.itproject.Prevalent.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class LoginActivity extends AppCompatActivity {

    private EditText InputPhoneNumber, InputPassword;
    private Button LoginButton, Register_btn, ForgetPasswordLink;
    private ProgressDialog loadingBar;
    private TextView AdminLink, NotAdminLink;
    private String parentDbName = "Users";
   TextView forgot_password_text_view;
 //   public CheckBox chkBoxRememberme;

    private int passwordNotVisible = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginButton = findViewById(R.id.login_btn);
        Register_btn = findViewById(R.id.register_btn);
        InputPassword = findViewById(R.id.login_password_input);
        InputPhoneNumber = findViewById(R.id.login_student_id_input);
        forgot_password_text_view = findViewById(R.id.forgot_password_text);
       // ForgetPasswordLink = findViewById(R.id.forget_password_link);
        loadingBar = new ProgressDialog(this);

     //   chkBoxRememberme = (CheckBox) findViewById(R.id.remember_me_chkb);
     //   Paper.init(this);


        forgot_password_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, PasswordRecovery.class));
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LoginUser();
            }
        });

        Register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Register.class));
            }
        });


    }

    private void LoginUser() {

        String id = InputPhoneNumber.getText().toString();
        String password = InputPassword.getText().toString();

        if (TextUtils.isEmpty(id)){
            Toast.makeText(this, "Please complete your details", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please complete your details", Toast.LENGTH_SHORT).show();
        }
        else
        {
            loadingBar.setTitle("Logging in User");
            loadingBar.setMessage("Please wait, while we are checking your credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            AllowAccessToAccount(id, password);
        }

    }

        private void AllowAccessToAccount(final String id, final String password) {


            final DatabaseReference RootRef;
            RootRef = FirebaseDatabase.getInstance().getReference();

            RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot)
                {
                    if (dataSnapshot.child(parentDbName).child(id).exists())
                    {
                        Users usersData = dataSnapshot.child(parentDbName).child(id).getValue(Users.class);
                         //if (usersData.getStudentID().equals(id))

                        {
                            if (usersData.getPassword().equals(password))
                            {
                                if (parentDbName.equals("Users"))
                                {
                                    Toast.makeText(LoginActivity.this, "Logged in Successfully...", Toast.LENGTH_SHORT).show();
                                    loadingBar.dismiss();


                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    Prevalent.currentOnlineUser  = usersData;
                                    startActivity(intent);

                                }
                            }
                            else
                            {
                                loadingBar.dismiss();
                                Toast.makeText(LoginActivity.this, "Password is Incorrect", Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Account with this " + id +" does not exist", Toast.LENGTH_SHORT).show();
                        loadingBar.dismiss();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
    }




