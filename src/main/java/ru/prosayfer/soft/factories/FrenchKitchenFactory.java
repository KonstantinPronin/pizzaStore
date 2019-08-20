package ru.prosayfer.soft.factories;

import ru.prosayfer.soft.kitchens.AbstractKitchen;
import ru.prosayfer.soft.kitchens.FrenchKitchen;

public class FrenchKitchenFactory implements KitchenFactory {
    @Override
    public AbstractKitchen createKitchen() {
        return new FrenchKitchen();
    }
}
