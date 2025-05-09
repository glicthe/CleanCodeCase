package com.listingtest;

public class Airport {
    
    public static void main(String[] args) {
        Flight economyFlight = new Flight("1", "Economy");
        Flight bussinessFlight = new Flight("2", "Business");

        Passanger james = new Passanger("james", true );
        Passanger mike = new Passanger("Mike", false ); 

        bussinessFlight.addPassanger(james);
        bussinessFlight.removePassanger(james);
        bussinessFlight.addPassanger(mike);
        economyFlight.addPassanger(mike);

        System.out.println("Bussiness flight passangers List: ");
        for (Passanger passanger : bussinessFlight.getPassangersList()) {
            System.out.println(passanger.getName());
        }
        System.out.println("Economy flight passangers List: ");
        for (Passanger passanger : economyFlight.getPassangersList()) {
            System.out.println(passanger.getName());    
        }
    }
}
