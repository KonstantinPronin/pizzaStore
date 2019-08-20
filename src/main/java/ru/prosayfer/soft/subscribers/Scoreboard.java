package ru.prosayfer.soft.subscribers;

public class Scoreboard implements Subscriber {
    private int orderNumber;

    @Override
    public void update(String info) {
        System.out.printf("Order #%s ready!\n%s", orderNumber, info);
        ++orderNumber;

        if (orderNumber == 100) {
            orderNumber = 0;
        }
    }
}
