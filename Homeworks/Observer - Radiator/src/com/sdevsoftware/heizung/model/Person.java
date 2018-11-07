package com.sdevsoftware.heizung.model;

/**
 * Person - Observer
 * @author sojournercntl
 */
public class Person implements IObserver {

    @Override
    public void update() {
       System.out.println("Students: Its getting warmer in here...");
    }

}
