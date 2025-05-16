package com.listingtest;

public class EconomyFlight extends Flight {
    public EconomyFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassanger(Passanger passanger) {
        return passangers.add(passanger);
    }

    @Override
    public boolean removePassanger(Passanger passanger) {
        if (!passanger.isVip()) {
            return passangers.remove(passanger);
        }
        return false;
    }
    
}