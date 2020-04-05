package com.example.tourguideapp.model;

public class Place {

    private String name;
    private int image;
    private String location;

    public Place(String name, int image, String location) {
        this.name = name;
        this.image = image;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }
}
