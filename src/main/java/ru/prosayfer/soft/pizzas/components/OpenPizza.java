package ru.prosayfer.soft.pizzas.components;

public class OpenPizza implements Pizza {
    @Override
    public String prepare() {
        return "Open pizza";
    }
}
