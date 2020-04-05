package com.example.tourguideapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tourguideapp.R;
import com.example.tourguideapp.model.Place;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesListAdapter extends RecyclerView.Adapter<PlacesListAdapter.ViewHolder> {

    private List<Place> mPlacesList;
    private Context mContext;

    public PlacesListAdapter(List<Place> mPlacesList, Context mContext) {

        this.mPlacesList = mPlacesList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.place_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        setDataOnViews(mPlacesList.get(position), holder);
    }

    private void setDataOnViews(Place place, ViewHolder holder) {

        holder.name_tv.setText(place.getName());
        holder.location_tv.setText(place.getLocation());
        holder.placeItem.setBackground(ContextCompat.getDrawable(mContext, place.getImage()));

    }

    @Override
    public int getItemCount() {
        return mPlacesList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name_tv;
        private TextView location_tv;
        private ConstraintLayout placeItem;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name_tv = itemView.findViewById(R.id.place_name);
            location_tv = itemView.findViewById(R.id.place_location);
            placeItem = itemView.findViewById(R.id.place_item);


        }
    }
}
