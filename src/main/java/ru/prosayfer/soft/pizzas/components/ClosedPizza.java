package ru.prosayfer.soft.pizzas.components;

public class ClosedPizza implements Pizza {
    @Override
    public String prepare() {
        return "Closed pizza";
    }
}
