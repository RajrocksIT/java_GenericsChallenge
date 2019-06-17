package com.rajeshchinni;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> League = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if (League.contains(team)){
            return false;
        }
        League.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(League);
        for (T t: League){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }


}
