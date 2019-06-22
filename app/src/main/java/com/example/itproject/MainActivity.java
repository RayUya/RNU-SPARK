package com.example.itproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
// Landing Page Linear Layout ID's
    LinearLayout lay_time_table;
    LinearLayout lay_lecturers;
    LinearLayout lay_news;
    LinearLayout lay_caf;
    LinearLayout lay_calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lay_time_table = findViewById(R.id.time_table_btn);
        lay_lecturers = findViewById(R.id.lecturers_btn);
        lay_news = findViewById(R.id.news_btn);
        lay_caf = findViewById(R.id.caf_btn);
        lay_calender = findViewById(R.id.calendar_btn);

        // Starts the page Time Table and Class Schedule
        lay_time_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ClassSchedulePage.class ));
            }
        });
        // Starts the page Lecturers
        lay_lecturers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LecturersPage.class));
            }
        });
        // Starts the page School news and News and Events
        lay_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SchoolNewsPage.class));
            }
        });
        // Starts the page Caf Menu
        lay_caf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FoodMenuPage.class));
            }
        });
        // Starts the page Calender
        lay_calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CalenderPage.class));
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "No users online", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
     /*Navigates all menu items to different activities*/
        if (id == R.id.nav_grades) {
            // Handle the grades page

            Intent intent = new Intent(MainActivity.this, GradesPage.class);
            this.startActivity(intent);

        } else if (id == R.id.nav_registration) {
            //  Handle the courses to register

            Intent intent = new Intent(MainActivity.this,CourseRegistrationPage.class);
            this.startActivity(intent);

        } else if (id == R.id.nav_schedule) {
            // Handle the students time table

            Intent intent = new Intent(MainActivity.this, ClassSchedulePage.class);
            this.startActivity(intent);



        } else if (id == R.id.nav_info) {
            // Handles events and news


            Intent intent = new Intent(MainActivity.this, SchoolNewsPage.class);
            this.startActivity(intent);


        } else if (id == R.id.nav_about) {
            // Handles information about the school

            Intent intent = new Intent(MainActivity.this, AboutPage.class);
            this.startActivity(intent);


        } else if (id == R.id.nav_lecturers) {
            // Handles lecturers information

            Intent intent = new Intent(MainActivity.this, LecturersPage.class);
            this.startActivity(intent);


        } else if (id == R.id.nav_coursemates) {
            // Handles course mates information

            Intent intent = new Intent(MainActivity.this, CoursematesPage.class);
            this.startActivity(intent);


        } else if (id == R.id.nav_students) {
            // Handles all students information

            Intent intent = new Intent(MainActivity.this, StudentsPage.class);
            this.startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       switch (item.getItemId()) {
           case R.id.nav_grades:

               break;
           case R.id.nav_registration:

               break;
           case R.id.nav_schedule:

               break;
           case R.id.nav_info:

               break;
           case R.id.nav_about:

               break;
           case R.id.nav_lecturers:

               break;
           case R.id.nav_coursemates:

               break;
           case R.id.nav_students:

           default:
               return super.onOptionsItemSelected(item);
       }

       return true;
   }

}

