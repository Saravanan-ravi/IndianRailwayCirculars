package com.example.indianrailwaycirculars;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class SecondMainActivity extends AppCompatActivity {

    private static final String TAG = "SecondMainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    private TabLayout tabLayout;

    SearchView searchView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        toolbar.setNavigationIcon(R.drawable.ic_back_arrow_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        //SearchView old codes are hidden
/*
SearchView sv = (SearchView) findViewById(R.id.action_search_main);
        //SEARCH
       // sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String query) {
            //FILTER AS YOU TYPE

            return false;
        }
    });
            // mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());


        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
*/

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
}


    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.common_menubar, menu);
        // Associate searchable configuration with the SearchView

        return true;

    }


    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());


        adapter.addFragment(new Tab2020(), "2020");
        adapter.addFragment(new Tab2019(), "2019");
        adapter.addFragment(new Tab2018(), "2018");
        adapter.addFragment(new Tab2017(), "2017");
        adapter.addFragment(new Tab2016(), "2016");
        adapter.addFragment(new Tab2015(), "2015");
        viewPager.setAdapter(adapter);

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title, Bundle args) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
            fragment.setArguments(args);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}
