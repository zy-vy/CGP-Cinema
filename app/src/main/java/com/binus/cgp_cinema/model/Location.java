package com.binus.cgp_cinema.model;

public class Location {

    Double latitude;
    Double longitude;
    String name;

    public Location() {
    }

    public Location(String name, Double latitude, Double longitude ) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}