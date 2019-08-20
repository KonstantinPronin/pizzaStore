package ru.prosayfer.soft.pizzas.decorators;

import ru.prosayfer.soft.pizzas.components.Pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
