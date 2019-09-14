package com.example.indianrailwaycirculars;

import android.content.SharedPreferences;
import android.os.Bundle;
//github.com/saini2sandeep/Favourite.git
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteCirculars extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Story> storyList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_item_row);
        recyclerView = findViewById(R.id.fav_recycler_view);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", 0);
        PreferenceManager preferenceManager = new PreferenceManager(sharedPreferences);
        AppPreferences appPreferences = new AppPreferences(preferenceManager);

        setUpData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerViewAdapter(storyList, this, appPreferences));
    }

    private void setUpData() {

        for (int i = 0; i < 10; i++) {
            Story story = new Story();
            story.setIdStory(String.valueOf(i));
          if (i % 2 == 0)
            story.setIsLiked(0);
            else
                story.setIsLiked(1);
            story.setTitle("Sample " + i);

            storyList.add(story);
        }
    }
}