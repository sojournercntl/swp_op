package com.sdevsoftware.pizza.products;

public class Americana implements IPizza{

    @Override
    public void backen() {
        System.out.println("Americana wird gebacken.");
    }

    @Override
    public void zutatenHinzufugen() {
        System.out.println("Americana bekommt zutaten drauf geworfen.");
    }

    @Override
    public void ausrollen() {
        System.out.println("Americana wird ausgerollt.");
    }

}
