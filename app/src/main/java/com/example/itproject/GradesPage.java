package com.example.itproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GradesPage extends AppCompatActivity {

    TextView scheduler;
    TextView carryover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades_page);

        scheduler = findViewById(R.id.class_schedule_btn);
        carryover = findViewById(R.id.Carry_over_btn);

        scheduler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GradesPage.this, ClassSchedulePage.class));
            }
        });

        carryover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GradesPage.this, CarryOverPage.class));
            }
        });


    }
}
