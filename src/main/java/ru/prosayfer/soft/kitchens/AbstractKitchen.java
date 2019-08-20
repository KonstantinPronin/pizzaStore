package ru.prosayfer.soft.kitchens;

import ru.prosayfer.soft.subscribers.Publisher;
import ru.prosayfer.soft.subscribers.Subscriber;
import ru.prosayfer.soft.pizzas.components.Pizza;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractKitchen implements Kitchen, Publisher {
    private List<Subscriber> subscribers;

    public AbstractKitchen() {
        subscribers = new LinkedList<>();
    }

    protected abstract Pizza createPizza();

    @Override
    public void preparePizza() {
        Pizza pizza = createPizza();
        notifySubscribers(pizza.prepare());
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String info) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(info);
        }
    }
}
