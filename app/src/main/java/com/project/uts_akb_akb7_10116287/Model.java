package com.project.uts_akb_akb7_10116287;

    /* 21 Mei 2019
        10116287
        Vanadia Aviandi
        AKB 7
     */
public class Model {

    //Model Intro
    String Title,Description;
    int ScreenImg;


    public Model(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}

