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

        placesList.add(new Place("Riyadh Park Mall",R.drawable.riyadh_park,"Riyadh"));
        placesList.add(new Place("Mall of Arabia",R.drawable.mall_of_arabia,"Jeddah"));
        placesList.add(new Place("Panorama Mall",R.drawable.panorama_mall," Riyadh"));
        placesList.add(new Place("Red Sea Mall",R.drawable.red_sea_mall,"Jeddah"));



        return placesList;

    }
}
