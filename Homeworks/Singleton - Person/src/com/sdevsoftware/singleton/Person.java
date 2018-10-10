package com.sdevsoftware.singleton;

public class Person {

    private int age = 18;

    private static Person ourInstance = new Person();

    public static Person getInstance() {
        return ourInstance;
    }

    private Person() { }

    public long getLifetimeSeconds(){
        return age*365*24*60*60;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
