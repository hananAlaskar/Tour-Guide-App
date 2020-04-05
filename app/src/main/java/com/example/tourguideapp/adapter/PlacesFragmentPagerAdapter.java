package com.example.tourguideapp.adapter;

import android.content.Context;

import com.example.tourguideapp.R;
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
    private Context mContext ;

    public PlacesFragmentPagerAdapter(@NonNull FragmentManager fm, Context mContext) {
        super(fm);

        this.mContext = mContext;
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

        String tabTitles[] = mContext.getResources().getStringArray(R.array.tabs);

        return tabTitles[position];
        
        
    }
}
