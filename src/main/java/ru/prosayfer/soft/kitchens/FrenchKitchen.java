package ru.prosayfer.soft.kitchens;

import ru.prosayfer.soft.pizzas.components.ClosedPizza;
import ru.prosayfer.soft.pizzas.components.Pizza;
import ru.prosayfer.soft.pizzas.decorators.Cheese;
import ru.prosayfer.soft.pizzas.decorators.Vegetables;

public class FrenchKitchen extends AbstractKitchen {
    @Override
    public Pizza createPizza() {
        Pizza pizza = new ClosedPizza();
        pizza = new Cheese(pizza);
        pizza = new Vegetables(pizza);
        return pizza;
    }
}
