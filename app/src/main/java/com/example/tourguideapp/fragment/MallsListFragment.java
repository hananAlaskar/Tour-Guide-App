package com.example.tourguideapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideapp.R;
import com.example.tourguideapp.adapter.PlacesListAdapter;
import com.example.tourguideapp.model.Place;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MallsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.malls_list_fragment, container, false);
        displayPlacesList(view);


        return view;
    }

    private void displayPlacesList(View view) {

        RecyclerView places_rv = view.findViewById(R.id.places_list_rv);
        List<Place> placesList = createPlacesList();
        PlacesListAdapter adapter = new PlacesListAdapter(placesList,getActivity());
        places_rv.setAdapter(adapter);
        places_rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        places_rv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
    }


    private List<Place> createPlacesList() {

        List<Place> placesList = new ArrayList<>();

        placesList.add(new Place(getString(R.string.riyadh_park_mall),R.drawable.riyadh_park,getString(R.string.riyadh)));
        placesList.add(new Place(getString(R.string.mall_of_arabia),R.drawable.mall_of_arabia,getString(R.string.jeddah)));
        placesList.add(new Place(getString(R.string.panorama_mall),R.drawable.panorama_mall,getString(R.string.riyadh)));
        placesList.add(new Place(getString(R.string.red_sea_mall),R.drawable.red_sea_mall,getString(R.string.jeddah)));


        return placesList;

    }
}
