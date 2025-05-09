package com.listingtest;

public class BussinessFlight extends Flight {
    public BussinessFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassanger(Passanger passanger) {
        if (passanger.isVip()) {
            return passangers.add(passanger);
        }
        return false;   
    }

    @Override
    public boolean removePassanger(Passanger passanger) {

        return false;
        
    }
    
}
