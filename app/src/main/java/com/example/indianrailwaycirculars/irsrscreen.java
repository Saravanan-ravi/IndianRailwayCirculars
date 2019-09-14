package com.example.indianrailwaycirculars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class irsrscreen extends AppCompatActivity {

    Button bt_indianrail,bt_southernrail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irsrscreen);

        bt_indianrail = (Button) findViewById(R.id.bt_indianrail);
        bt_southernrail=(Button) findViewById(R.id.bt_srrailway);


        bt_indianrail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), commercialMenu.class);
                startActivity(intent);
            }
        });

        bt_southernrail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SouthernRlymenu.class);
                startActivity(intent);
            }
        });


    }

}
