package com.example.indianrailwaycirculars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SouthernRlymenu extends AppCompatActivity {
    Button srLettersToDivision_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_southernrail_menu);

        Toolbar srtoolbar = findViewById(R.id.app_bar_for_sr);
        setSupportActionBar(srtoolbar);

        srtoolbar.setNavigationIcon(R.drawable.ic_back_arrow_24dp);

        srtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                finish();
            }
        });

        srLettersToDivision_bt = (Button) findViewById(R.id.bt_srLettersToDivision);

        srLettersToDivision_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SRLettersToDivision.class);
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.ir_main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

      if (id==R.id.ir_circular_item) {
          Intent IRCMMintent = new Intent(getApplicationContext(), IndianCommercialMenu.class);
          startActivity(IRCMMintent);

      } if (id==R.id.ir_exit_item) {
          moveTaskToBack(true);
          android.os.Process.killProcess(android.os.Process.myPid());
          System.exit(1);
          return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

