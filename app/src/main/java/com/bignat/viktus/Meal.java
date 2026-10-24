package com.bignat.viktus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Meal implements Serializable {
    public String name;
    public String description;
    public String imageUri;          // null = no image
    public List<Supply> supplies;    // the ingredients of this meal

    public Meal(String name, String description, String imageUri, List<Supply> supplies) {
        this.name = name;
        this.description = description;
        this.imageUri = imageUri;
        this.supplies = supplies;
    }

    // Convenience constructor for a meal with just a name
    public Meal(String name) {
        this(name, "", null, new ArrayList<>());
    }
}