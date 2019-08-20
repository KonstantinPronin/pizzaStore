package ru.prosayfer.soft.pizzas.decorators;

import ru.prosayfer.soft.pizzas.components.Pizza;

public class Ham extends PizzaDecorator {

    public Ham(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        return pizza.prepare() + " with ham";
    }
}
