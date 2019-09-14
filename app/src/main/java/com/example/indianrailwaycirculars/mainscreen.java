package com.example.indianrailwaycirculars;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class mainscreen extends AppCompatActivity {

    private Handler mWaitHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        mWaitHandler = new Handler();

        //  ImageView logo;
        // logo = (ImageView) findViewById(R.id.mainimage);

/*        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainscreen.this,commercialMenu.class);
                startActivity(intent);



            }
        });*/

        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {


                try {

/*                    Intent intent = new Intent(getApplicationContext(), commercialMenu.class);
                    startActivity(intent);*/


                    Intent intent = new Intent(getApplicationContext(), irsrscreen.class);
                    startActivity(intent);

                    finish();
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 4000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mWaitHandler.removeCallbacksAndMessages(null);
    }

}
