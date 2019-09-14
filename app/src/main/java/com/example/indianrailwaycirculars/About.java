package com.example.indianrailwaycirculars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);

        Toast.makeText(About.this,"Thanks for coming In..!", Toast.LENGTH_SHORT).show();

    }
}
