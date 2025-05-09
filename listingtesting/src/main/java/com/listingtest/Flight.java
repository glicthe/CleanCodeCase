package com.listingtest;
import java.util.Collections;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight {
    private String id;
    List<Passanger> passangers = new ArrayList<Passanger>();
    
    public Flight(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public List<Passanger> getPassangersList() {
        return Collections.unmodifiableList(passangers);
    }   
    
    public abstract boolean addPassanger(Passanger passanger);
    public abstract boolean removePassanger(Passanger passanger);
}