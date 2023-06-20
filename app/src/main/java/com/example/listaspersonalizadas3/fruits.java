package com.example.listaspersonalizadas3;

public class fruits {

    private int imageId;
    private String name;
    private double price;

    public fruits(int imageId, String name, double price) {
        this.imageId = imageId;
        this.name = name;
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
