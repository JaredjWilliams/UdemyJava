package com.example.udemyjavacourse.udemy_section_eight.polymorphism.burger_challenge;

public class Item {

    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice() {
        return switch (type) {
            case "Side" -> {
                price += .50;
                yield .50;
            }
            default -> {
                yield 0;
            }
        };
    }
}
