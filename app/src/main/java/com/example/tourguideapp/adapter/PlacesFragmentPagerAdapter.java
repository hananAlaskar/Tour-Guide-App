package com.example.tourguideapp.adapter;

import com.example.tourguideapp.fragment.AncientPlacesListFragment;
import com.example.tourguideapp.fragment.MallsListFragment;
import com.example.tourguideapp.fragment.NaturalPlacesListFragment;
import com.example.tourguideapp.fragment.RestaurantsListFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PlacesFragmentPagerAdapter extends FragmentPagerAdapter {

    final static int NUMBER_OF_FRAGMENT = 4;

    private String tabTitles[] = new String[] {"Ancient", "Food", " Natural", " Malls" };


    public PlacesFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new AncientPlacesListFragment();
            case 1:
                return new RestaurantsListFragment();
            case 2:
                return new NaturalPlacesListFragment();
            case 3:
                return new MallsListFragment();
        }

        return new AncientPlacesListFragment();
    }

    @Override
    public int getCount() {
        return NUMBER_OF_FRAGMENT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
        
        
    }
}
