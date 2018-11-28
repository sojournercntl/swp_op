package com.sdevsoftware.pizza.factory;

import com.sdevsoftware.pizza.products.Americana;
import com.sdevsoftware.pizza.products.Diavolo;
import com.sdevsoftware.pizza.products.IPizza;
import com.sdevsoftware.pizza.products.Margherita;

public class PizzaFactory {

    public IPizza getPizza(String pizza){

        if(pizza.equals("DIAVOLO")){
            Diavolo diavolo = new Diavolo();
            diavolo.ausrollen();
            diavolo.zutatenHinzufugen();
            diavolo.backen();
            return diavolo;
        }else if(pizza.equals("AMERICANA")){
            Americana americana = new Americana();
            americana.ausrollen();
            americana.zutatenHinzufugen();
            americana.backen();
            return americana;
        }else if(pizza.equals("MARGHERITA")){
            Margherita margherita = new Margherita();
            margherita.ausrollen();
            margherita.zutatenHinzufugen();
            margherita.backen();
            return margherita;
        }else{
            return null;
        }

    }

}
