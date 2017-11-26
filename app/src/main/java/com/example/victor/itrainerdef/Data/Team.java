package com.example.victor.itrainerdef.Data;

/**
 * Created by Victor on 24/11/2017.
 */

public class Team {
    private static String team;
    private static String password;

    public Team(String t,String p){
        this.team=t;
        this.password=p;
    }

    public static String getTeam() {
        return team;
    }

    public static void setTeam(String team) {
        Team.team = team;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Team.password = password;
    }



}
