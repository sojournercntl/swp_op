package com.sdevsoftware.heizung.model;

/**
 * School Observer
 * @author sojournercntl
 */
public class School implements IObserver{

    @Override
    public void update() {
        System.out.println("School: Der classrooms are getting warmer!");
    }

}
