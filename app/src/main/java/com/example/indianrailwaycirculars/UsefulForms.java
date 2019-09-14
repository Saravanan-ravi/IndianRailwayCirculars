package com.example.indianrailwaycirculars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class UsefulForms extends AppCompatActivity {

    Button lap_bt,cl_bt,holidayhome_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usefull_forms);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                finish();
            }
        });


        lap_bt = (Button) findViewById(R.id.bt_lap);
        cl_bt = (Button) findViewById(R.id.bt_cl);
        holidayhome_bt = (Button) findViewById(R.id.bt_holidayhome);



        lap_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lapForm = new Intent(getApplicationContext(),OpenUsefulForm.class);
                startActivity(lapForm);

            }
        });

      /*  cl_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holidayhome_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });*/





    }
}
