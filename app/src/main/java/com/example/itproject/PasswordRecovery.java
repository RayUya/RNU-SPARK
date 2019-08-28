package com.example.itproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PasswordRecovery extends AppCompatActivity {

    Button recover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        recover = findViewById(R.id.recovery_btn);

                recover.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (recover.isPressed()) {
                            Toast.makeText(getBaseContext(), "Your password has been sent!", Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }

}
