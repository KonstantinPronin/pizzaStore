package ru.prosayfer.soft;

import ru.prosayfer.soft.factories.FrenchKitchenFactory;
import ru.prosayfer.soft.factories.ItalianKitchenFactory;
import ru.prosayfer.soft.factories.KitchenFactory;
import ru.prosayfer.soft.kitchens.AbstractKitchen;
import ru.prosayfer.soft.kitchens.Kitchen;
import ru.prosayfer.soft.subscribers.Scoreboard;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {
    private Kitchen kitchen;

    public PizzaStore(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore = createStore();
        if (pizzaStore == null) {
            return;
        }
        pizzaStore.makeOrder();
    }

    private static PizzaStore createStore() throws IOException {
        KitchenFactory kitchenFactory = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)))) {
            System.out.println("Select country: ");
            switch (reader.readLine()) {
                case "Italy":
                    kitchenFactory = new ItalianKitchenFactory();
                    break;
                case "France":
                    kitchenFactory = new FrenchKitchenFactory();
                    break;
                default:
                    return null;
            }
        }
        AbstractKitchen kitchen = kitchenFactory.createKitchen();
        kitchen.subscribe(new Scoreboard());
        return new PizzaStore(kitchen);
    }

    public void makeOrder() {
        kitchen.preparePizza();
    }
}
