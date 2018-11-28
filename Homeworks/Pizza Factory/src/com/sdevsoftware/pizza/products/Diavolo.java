package com.sdevsoftware.pizza.products;

public class Diavolo implements IPizza{


    @Override
    public void backen() {
        System.out.println("Diavolo wird gebacken.");
    }

    @Override
    public void zutatenHinzufugen() {
        System.out.println("Diavolo bekommt zutaten drauf geworfen.");
    }

    @Override
    public void ausrollen() {
        System.out.println("Diavolo wird ausgerollt.");
    }
}
