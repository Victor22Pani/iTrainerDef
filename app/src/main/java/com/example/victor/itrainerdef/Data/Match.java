package com.example.victor.itrainerdef.Data;

/**
 * Created by Victor on 24/11/2017.
 */

public class Match {
    private String date;
    private String place;
    private String condiction;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCondiction() {
        return condiction;
    }

    public void setCondiction(String condiction) {
        this.condiction = condiction;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    private String rival;

    public Match(String d,String p,String c,String r){
        this.date=d;
        this.place=p;
        this.condiction=c;
        this.rival=r;
    }
}

