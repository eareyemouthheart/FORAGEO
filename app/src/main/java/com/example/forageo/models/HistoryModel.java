package com.example.forageo.models;

public class HistoryModel {
    int image;
    String name;
    String rating;
    String location;

    public HistoryModel(int image, String name, String rating, String location) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
