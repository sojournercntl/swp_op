package com.sdevsoftware.pizza.factory;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    private PizzaFactory factory;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        factory = new PizzaFactory();
    }

    @org.junit.jupiter.api.Test
    void getPizzaAmericana() {
        assertNotNull(factory.getPizza("AMERICANA"));
    }

    @org.junit.jupiter.api.Test
    void getPizzaDiavolo() {
        assertNotNull(factory.getPizza("DIAVOLO"));
    }

    @org.junit.jupiter.api.Test
    void getPizzaMargherita() {
        assertNotNull(factory.getPizza("MARGHERITA"));
    }

}