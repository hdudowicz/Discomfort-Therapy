package com.hdstudios.discomforttherapy2;

import android.media.Image;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

@Entity
public class Challenge {
    @Id
    private Integer ID;

    private String text;
    private Integer category;

    Challenge(Integer ID, String text, Integer category) {
        this.text = text;
        this.ID = ID;
        this.category = category;
    }
}
