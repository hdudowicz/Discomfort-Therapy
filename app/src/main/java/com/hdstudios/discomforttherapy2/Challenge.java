package com.hdstudios.discomforttherapy2;

import android.media.Image;


public class Challenge {
    private Integer ID;

    private String text;
    private Integer category;

    public Challenge(Integer ID, String text, Integer category) {
        this.ID = ID;
        this.text = text;
        this.category = category;
    }

    public Challenge() {
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
