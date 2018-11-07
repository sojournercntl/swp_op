package com.sdevsoftware.heizung.model;

/**
 * ISubject Interface
 * @author sojournercntl
 */
public interface ISubject {

    public void notify_observer();

    public void register(IObserver observer);

}
