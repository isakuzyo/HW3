package com.example.hw3;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

// for the images
public class CatList {

    @SerializedName("url")
    private String imageUrl;

    private ArrayList<Cat> breeds;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
