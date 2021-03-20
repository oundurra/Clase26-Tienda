package com.example.clase26_tienda;

import android.nfc.NfcAdapter;

public class Drink {
    private String name;
    private String description;
    private int imageId;
    public final static Drink drinks[] = {
            new Drink("Cappuchino", "Es un Capuchino", R.drawable.capuccino),
            new Drink("Latte", "Es un Latte", R.drawable.capuccino),
    };

    public Drink() {
    }

    public Drink(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
