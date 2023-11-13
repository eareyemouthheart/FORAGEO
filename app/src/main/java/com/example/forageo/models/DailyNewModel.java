package com.example.forageo.models;

public class DailyNewModel {

    int image;
    String name;
    String description;
    String forageotime;

    public DailyNewModel(int image, String name, String description, String forageotime) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.forageotime = forageotime;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getforageotime() {
        return forageotime;
    }

    public void setforageotime(String forageoLocation) { this.forageotime = forageotime; }
}
