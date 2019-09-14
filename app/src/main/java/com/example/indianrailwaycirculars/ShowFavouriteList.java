package com.example.indianrailwaycirculars;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class ShowFavouriteList extends AppCompatActivity {


    private RecyclerView favrecyclerView;
    private TextView noFavtsTV;

    AppPreferences appPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_favourite_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.years_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                finish();
            }
        });

        favrecyclerView = findViewById(R.id.fav_recycler_view);
        noFavtsTV = findViewById(R.id.no_favt_text);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        PreferenceManager preferenceManager = new PreferenceManager (sharedPreferences);
        appPreferences = new AppPreferences(preferenceManager);

        fetchData();
    }

    private void fetchData() {
        List<Story> storyList = appPreferences.getFavouriteCardList();

        if (storyList != null && storyList.size() > 0) {
            showNoFavtText(false);
            favrecyclerView.setHasFixedSize(true);
            favrecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
            favrecyclerView.setAdapter(new RecyclerViewAdapter(storyList, this,appPreferences));
        } else {
            showNoFavtText(true);
        }
    }

    private void showNoFavtText(boolean show) {
        noFavtsTV.setVisibility(show ? View.VISIBLE : View.GONE);
        favrecyclerView.setVisibility(show ? View.GONE : View.VISIBLE);
    }
}
