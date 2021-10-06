package com.example.autocompletetextview;

public class HmjItem {
    private String hmjName;
    private int flagImage;

    public HmjItem(String hmjName, int flagImage) {
        this.hmjName = hmjName;
        this.flagImage = flagImage;
    }
    public String getHmjName() {
        return hmjName;
    }

    public int getFlagImage() {
        return flagImage;
    }
}
