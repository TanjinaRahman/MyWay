package com.example.tinni.myway.Model;

public class Product {
    private String Name;
    private String Image;
    private String Description;


    public Product(){
    }

    public Product(String name, String image, String description) {
        Name = name;
        Image = image;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
