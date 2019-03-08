package com.example.projectapp;

public class Note {
    int Image;
    String date;
    String text;

    public Note(int image, String date, String text) {
        Image = image;
        this.date = date;
        this.text = text;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
