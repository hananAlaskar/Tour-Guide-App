package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PlacesFragmentPagerAdapter extends FragmentPagerAdapter {

    final static int NUMBER_OF_FRAGMENT = 4;


    public PlacesFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new HistoricalPlacesListFragment();
            case 1:
                return new RestaurantsListFragment();
            case 2:
                return new NaturalPlacesListFragment();
            case 3:
                return new MallsListFragment();
        }

        return new HistoricalPlacesListFragment();
    }

    @Override
    public int getCount() {
        return NUMBER_OF_FRAGMENT;
    }
}
