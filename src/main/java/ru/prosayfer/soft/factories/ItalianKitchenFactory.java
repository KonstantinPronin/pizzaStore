package ru.prosayfer.soft.factories;

import ru.prosayfer.soft.kitchens.AbstractKitchen;
import ru.prosayfer.soft.kitchens.ItalianKitchen;

public class ItalianKitchenFactory implements KitchenFactory {
    @Override
    public AbstractKitchen createKitchen() {
        return new ItalianKitchen();
    }
}
