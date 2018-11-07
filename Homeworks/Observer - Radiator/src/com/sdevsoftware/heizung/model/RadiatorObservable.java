package com.sdevsoftware.heizung.model;

import java.util.ArrayList;

/**
 * Radiator - Observable
 * @author sojournercntl
 */
public class RadiatorObservable implements ISubject {

    // Holds the observers
    ArrayList<IObserver> observerCollection = new ArrayList<>();

    // Change the temperature of the 
    public void changeTemperature(double temp){
        System.out.println("The Temperature changed to: "+temp);
        notify_observer();
    }

    @Override
    public void notify_observer() {
        for (IObserver x:observerCollection
             ) {
            x.update();
        }
    }

    @Override
    public void register(IObserver observer) {
        observerCollection.add(observer);
    }
}
