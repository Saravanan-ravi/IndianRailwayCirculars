package com.example.indianrailwaycirculars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

public class IndianCommercialMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_commercial_menu);



        Toolbar irtoolbar = findViewById(R.id.app_bar_for_ir);
        setSupportActionBar(irtoolbar);


        irtoolbar.setNavigationIcon(R.drawable.ic_back_arrow_24dp); // Set the icon

        // Icon click listener
        irtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                finish();
            }
        });

        Button general_bt = (Button) findViewById(R.id.bt_general);
        Button commercialMannual_bt = (Button) findViewById(R.id.bt_manuals);





        general_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlist = new Intent(IndianCommercialMenu.this, SecondMainActivity.class);
                startActivity(intentlist);
            }

        });


        commercialMannual_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent commManual = new Intent(IndianCommercialMenu.this, commercialMannual.class);
                startActivity(commManual);

            }
        });





    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sr_main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sr_circular_item) {
            Intent SRCMMintent = new Intent(getApplicationContext(), SouthernRlymenu.class);
            startActivity(SRCMMintent);

        } if (id == R.id.sr_exit_item) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
