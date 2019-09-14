package com.example.indianrailwaycirculars;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/* public class SplashScreen extends AppCompatActivity {

  private Handler mWaitHandler;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.splash_screen);

       mWaitHandler = new Handler();

       //  ImageView logo;
       // logo = (ImageView) findViewById(R.id.mainimage);

          *//*logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreen.this,commercialMenu.class);
                startActivity(intent);



            }
        });
*//*
        mWaitHandler.postDelayed(new Runnable() {

            @Override
            public void run() {


                try {

                  Intent intentone = new Intent(getApplicationContext(), commercialMenu.class);
                    startActivity(intentone);


                    Intent intenttwo = new Intent(getApplicationContext(), irsrscreen.class);
                    startActivity(intenttwo);

                    finish();
                } catch (Exception ignored) {
                    ignored.printStackTrace();
                }
            }
        }, 3000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mWaitHandler.removeCallbacksAndMessages(null);
    }

}*/



public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;
    private Handler mWaitHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mySuperIntent);
                /* This 'finish()' is for exiting the app when back button pressed
                 *  from Home page which is ActivityHome
                 */
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}


