package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = findViewById(R.id.places_vp);
        PlacesFragmentPagerAdapter adapter = new PlacesFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }


}
