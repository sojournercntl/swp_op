package com.sdevsoftware.pizza;

import com.sdevsoftware.pizza.factory.PizzaFactory;
import com.sdevsoftware.pizza.products.Americana;
import com.sdevsoftware.pizza.products.Diavolo;
import com.sdevsoftware.pizza.products.Margherita;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        PizzaFactory pizzaFactory = new PizzaFactory();

        Americana americana = (Americana) pizzaFactory.getPizza("AMERICANA");
        Diavolo diavolo = (Diavolo)pizzaFactory.getPizza("DIAVOLO");
        Margherita margherita = (Margherita)pizzaFactory.getPizza("MARGHERITA");

    }
}
