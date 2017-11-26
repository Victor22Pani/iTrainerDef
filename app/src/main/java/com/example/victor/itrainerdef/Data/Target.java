package com.example.victor.itrainerdef.Data;

/**
 * Created by Victor on 26/11/2017.
 */

public class Card {
    private String minute;
    private boolean color;

    public Card (String m){
        this.minute=m;
        this.color=false;// si es false amarilla si es true roja
            }
     public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

}
