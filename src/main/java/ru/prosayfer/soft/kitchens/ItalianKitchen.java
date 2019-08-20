package ru.prosayfer.soft.kitchens;

import ru.prosayfer.soft.pizzas.components.OpenPizza;
import ru.prosayfer.soft.pizzas.components.Pizza;
import ru.prosayfer.soft.pizzas.decorators.Cheese;
import ru.prosayfer.soft.pizzas.decorators.Ham;

public class ItalianKitchen extends AbstractKitchen {
    @Override
    protected Pizza createPizza() {
        Pizza pizza = new OpenPizza();
        pizza = new Cheese(pizza);
        pizza = new Ham(pizza);
        return pizza;
    }
}
