package com.example.udemyjavacourse.udemy_section_eight.composition_challenge;

public class SmartKitchen {

    public CoffeeMaker brewMaster;
    public DishWasher dishWasher;
    public Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public void addWater() {
        brewMaster.hasWorkToDo = true;
    }

    public void pourMilk() {
        iceBox.hasWorkToDo = true;
    }

    public void loadDishWasher() {
        dishWasher.hasWorkToDo = true;
    }

    public void setKitchenState(boolean isToBrew, boolean isToOrder, boolean isToWash) {
        brewMaster.hasWorkToDo = isToBrew;
        iceBox.hasWorkToDo = isToOrder;
        dishWasher.hasWorkToDo = isToWash;
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
