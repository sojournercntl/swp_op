package com.sdevsoftware.singleton;

public class Main {

    public static void main(String[] args) {
	    // Person - get Instance from singleton and set the age in years... then print the lifespan in seconds (years)
        Person person = Person.getInstance();
        person.setAge(18);

        System.out.println("You are "+18+" years old. This means you live more than "+person.getLifetimeSeconds()+"+ seconds");

    }
}
