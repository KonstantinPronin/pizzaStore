package ru.prosayfer.soft.pizzas.decorators;

import ru.prosayfer.soft.pizzas.components.Pizza;

public class Vegetables extends PizzaDecorator{

    public Vegetables(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        return pizza.prepare() + " with vegetables";
    }
}
