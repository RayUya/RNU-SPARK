package com.example.itproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Register extends AppCompatActivity {


    private EditText Input_surname, Reg_othernames, Reg_department, Reg_faculty, Reg_no, Input_student_id, Input_password;
    private Button Register;
    private ProgressDialog loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Input_surname = findViewById(R.id.register_surname_input);
        Reg_othernames = findViewById(R.id.register_other_names_input);
        Reg_department = findViewById(R.id.register_department_input);
        Reg_faculty = findViewById(R.id.register_faculty_input);
        Reg_no = findViewById(R.id.register_reg_number_input);
        Input_student_id = findViewById(R.id.student_id_input);
        Input_password = findViewById(R.id.register_password_input);

        Register = findViewById(R.id.register_submit_btn);

        loadingBar = new ProgressDialog(this);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreateAccount();
            }
        });
    }

    private void CreateAccount() {
        String surname = Input_surname.getText().toString();
        String othernames = Reg_othernames.getText().toString();
        String department = Reg_department.getText().toString();
        String faculty = Reg_faculty.getText().toString();
        String registrationNumber = Reg_no.getText().toString();
        String password = Input_password.getText().toString();
        String id = Input_student_id.getText().toString();


        if (TextUtils.isEmpty(surname)){
            Toast.makeText(this, "Please enter your Surname", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(othernames)){
            Toast.makeText(this, "Input your Other Names", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(department)){
            Toast.makeText(this, "Enter your Department", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(faculty)){
            Toast.makeText(this, "Enter your Faculty", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(registrationNumber)){
            Toast.makeText(this, "Enter Your Reg. Number", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(id)){
            Toast.makeText(this, "Please enter your Password", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter your ID", Toast.LENGTH_SHORT).show();
        }else{

            loadingBar.setTitle("Creating Account");
            loadingBar.setMessage("Please wait, while you are being Registered");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            Validatephonenumber(surname, othernames, department, faculty, registrationNumber, id, password);
        }

    }

    private void Validatephonenumber(final String surname, final String othernames, final String department, final String faculty,
                                     final String registrationNumber, final String id, final String password) {

        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (!(dataSnapshot.child("Users").child(id).exists()))
                {
                    HashMap<String, Object> userdatamap = new HashMap<>();

                    userdatamap.put("Surname", surname);
                    userdatamap.put("Other Names", othernames);
                    userdatamap.put("Department", department);
                    userdatamap.put("Faculty", faculty);
                    userdatamap.put("Reg Number", registrationNumber);
                    userdatamap.put("password", password);
                    userdatamap.put("id", id);

                    RootRef.child("Users").child(id).updateChildren(userdatamap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Register.this, "Congratulations, your account has been created.", Toast.LENGTH_LONG).show();
                                loadingBar.dismiss();
                                Intent intent = new Intent(Register.this, LoginActivity.class);
                                startActivity(intent);
                            }
                            else {
                                 loadingBar.dismiss();
                                 Toast.makeText(Register.this, "Network Error: Please try again after some seconds.... ", Toast.LENGTH_LONG).show();
                            }
                        }
                    });

                }
                else {
                     Toast.makeText(Register.this, "This" + id + "already exists",Toast.LENGTH_LONG).show();
                     loadingBar.dismiss();
                     Toast.makeText(Register.this,"Please try again using another ID", Toast.LENGTH_LONG).show();

                     Intent intent = new Intent(Register.this, MainActivity.class);
                     startActivity(intent);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}

