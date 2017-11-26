package com.example.victor.itrainerdef.Data;

/**
 * Created by Victor on 25/11/2017.
 */

public class Player {

    private String name;
    private String lastname;
    private String dni;
    private String gol;
    private String min;
    private int number;

    public Player(String n,String l,String d,String g,String m,int num){
        this.name=n;
        this.lastname=l;
        this.dni=d;
        this.gol=g;
        this.min=m;
        this.number=num;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public String getGol() {

        return gol;
    }

    public void setGol(String gol) {

        this.gol = gol;
    }

    public String getMin() {

        return min;
    }

    public void setMin(String min) {

        this.min = min;
    }


}
