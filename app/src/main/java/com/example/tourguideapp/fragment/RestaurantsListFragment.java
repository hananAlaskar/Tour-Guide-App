package com.example.tourguideapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideapp.R;

import androidx.fragment.app.Fragment;

public class RestaurantsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.restaurants_list_fragment, container, false);
    }
}