package com.sdevsoftware.heizung.model;

/**
 * Government - Observer
 * @author sojournercntl
 */
public class Government implements IObserver{

    @Override
    public void update() {
        System.out.println("Government: The CO2 emissions are rising.");
    }

}
