package com.example.indianrailwaycirculars;
import android.app.Fragment;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.widget.SearchView;

import java.io.File;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.SearchManager;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    Button bt_indianrail, bt_southernrail, test_button;

    private Fragment fragment = null;

    private android.app.FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        FloatingActionButton fab = findViewById(R.id.fab);
        bt_indianrail = (Button) findViewById(R.id.bt_indianrail);
        bt_southernrail = (Button) findViewById(R.id.bt_srrailway);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        bt_indianrail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent IRCMintent = new Intent(MainActivity.this, IndianCommercialMenu.class);
                startActivity(IRCMintent);
            }

        });

        bt_southernrail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent SRCMintent = new Intent(MainActivity.this, SouthernRlymenu.class);
                startActivity(SRCMintent);
            }
        });

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
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
        // Associate searchable configuration with the SearchView

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_exit) {

            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

        if (id == R.id.fav_menu) {

            Intent favoIntent = new Intent(this, ShowFavouriteList.class);
            startActivity(favoIntent);
        }

        if (id == R.id.action_otherforms) {

            Intent usefulformses = new Intent(this, UsefulForms.class);
            startActivity(usefulformses);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            Intent homeIntent = new Intent(this, MainActivity.class);
            startActivity(homeIntent);

        } else if (id == R.id.nav_favorite) {

            Intent favIntent = new Intent(this, ShowFavouriteList.class);
            startActivity(favIntent);

        } else if (id == R.id.nav_downloads) {

            Intent downloadfolder = new Intent(Intent.ACTION_GET_CONTENT);
            Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()
                    + File.separator + "myFolder" + File.separator);
            downloadfolder.setDataAndType(uri, "text/.pdf");
            startActivity(Intent.createChooser(downloadfolder, "open folder"));

        } else if (id == R.id.nav_2018) {

            Toast.makeText(MainActivity.this, "Available soon", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_2017) {

            Toast.makeText(MainActivity.this, "Available soon", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_otherforms) {

            Intent usefulforms = new Intent(this, UsefulForms.class);
            startActivity(usefulforms);

            // Toast.makeText(MainActivity.this, "Available soon", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_write) {

            Intent writeIntent = new Intent(this, WriteFeedback.class);
            startActivity(writeIntent);

        } else if (id == R.id.nav_share) {

            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=in.org.railnet.indianrailwaycirculars&hl=en_IN");
            startActivity(Intent.createChooser(share, "Sharing 'Rail Dhandora App'"));

        } else if (id == R.id.nav_about) {

            Intent aboutIntent = new Intent(this, About.class);
            startActivity(aboutIntent);

        } else if (id == R.id.exit_btn_nav) {

            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void displayView(int position) {
        fragment = null;
        String fragmentTags = "";
        switch (position) {
            case 0:
                fragment = new Fragment();
                break;

            default:
                break;
        }

        if (fragment != null) {
            fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment, fragmentTags).commit();
        }
    }
}