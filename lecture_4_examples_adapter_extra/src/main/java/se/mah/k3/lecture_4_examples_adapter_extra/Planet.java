package se.mah.k3.lecture_4_examples_adapter_extra;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
public class Planet implements Serializable{
    String title;
    String isbn;
    Drawable image;
    String description;
    String name;
    String data;

    public Planet(String name, String data, String description, Drawable image) {
        this.name = name;
        this.data = data;
        this.description = description;
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
