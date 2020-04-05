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

public class RestaurantsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.restaurants_list_fragment, container, false);
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

        placesList.add(new Place("Najd Village",R.drawable.najd_village,"Riyadh"));
        placesList.add(new Place("Byblos ",R.drawable.byblos_,"Jeddah"));
        placesList.add(new Place("Al Orjouan",R.drawable.al_orjouan,"Riyadh"));
        placesList.add(new Place("The Globeh",R.drawable.the_globe,"Riyadh"));



        return placesList;

    }
}
