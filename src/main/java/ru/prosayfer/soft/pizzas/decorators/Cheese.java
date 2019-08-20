package ru.prosayfer.soft.pizzas.decorators;

import ru.prosayfer.soft.pizzas.components.Pizza;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        return pizza.prepare() + " with cheese";
    }
}
