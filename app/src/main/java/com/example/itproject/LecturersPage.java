package com.example.itproject;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LecturersPage extends AppCompatActivity {

    ImageView call;
    ImageView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturers_page);

        call = findViewById(R.id.call_hod);
        text = findViewById(R.id.text_hod);

        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("+2348160548201"));
                if (ActivityCompat.checkSelfPermission(LecturersPage.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)

                    startActivity(callIntent); */

            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
