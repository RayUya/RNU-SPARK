package com.example.itproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    Button login;
    Button register;
    EditText id;
    EditText password;
    TextView recover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login_btn);
        register = findViewById(R.id.register_btn);
        recover = findViewById(R.id.forgot_password_text);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetErrorButton();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Register.class));
            }
        });

        recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, PasswordRecovery.class));
            }
        });

    }

    public void SetErrorButton() {

        id = findViewById(R.id.student_id);
        password = findViewById(R.id.student_password);

        String Id = id.getText().toString();
        String Password = password.getText().toString();

        if (TextUtils.isEmpty(Id)) {

            id.setError("Invalid user id");
        }

       else if (TextUtils.isEmpty(Password)) {

            password.setError("Enter your password");

        } else {

                startActivity(new Intent(LoginActivity.this, MainActivity.class));

            }
        }

    }


