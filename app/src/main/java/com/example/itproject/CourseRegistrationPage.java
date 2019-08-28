package com.example.itproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourseRegistrationPage extends AppCompatActivity {

    TextView schedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_registration_page);

        schedule = findViewById(R.id.schedule_text_view);

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CourseRegistrationPage.this, ClassSchedulePage.class));
            }
        });

    }
}
