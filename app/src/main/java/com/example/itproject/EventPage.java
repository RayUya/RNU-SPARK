package com.example.itproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventPage extends AppCompatActivity {

    Button going;
    Button notGoing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);

        going = findViewById(R.id.going_btn);
        notGoing = findViewById(R.id.not_going_btn);

        going.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (going.isPressed()) {
                    Toast.makeText(getBaseContext(), "You are Going", Toast.LENGTH_SHORT).show();

                }

            }
        });

        notGoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (notGoing.isPressed()) {
                    Toast.makeText(getBaseContext(), "You are not going", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }

}

