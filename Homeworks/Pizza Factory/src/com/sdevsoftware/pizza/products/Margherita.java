package com.sdevsoftware.pizza.products;

public class Margherita implements IPizza{

    @Override
    public void backen() {
        System.out.println("Margherita wird gebacken.");
    }

    @Override
    public void zutatenHinzufugen() {
        System.out.println("Margherita bekommt zutaten drauf geworfen.");
    }

    @Override
    public void ausrollen() {
        System.out.println("Margherita wird ausgerollt.");
    }

}
