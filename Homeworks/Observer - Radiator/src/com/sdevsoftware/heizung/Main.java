package com.sdevsoftware.heizung;


import com.sdevsoftware.heizung.model.Government;
import com.sdevsoftware.heizung.model.Person;
import com.sdevsoftware.heizung.model.RadiatorObservable;
import com.sdevsoftware.heizung.model.School;


public class Main {

    public static void main(String[] args) {
        RadiatorObservable radiator = new RadiatorObservable();

        Person person = new Person();
        School school = new School();
        Government government = new Government();

        radiator.register(person);
        radiator.register(school);
        radiator.register(government);

        radiator.changeTemperature(25.0);
    }

}
