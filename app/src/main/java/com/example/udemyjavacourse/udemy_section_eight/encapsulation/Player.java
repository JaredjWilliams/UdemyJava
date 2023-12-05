package com.example.udemyjavacourse.udemy_section_eight.encapsulation;

public class Player {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else this.healthPercentage = Math.min(healthPercentage, 100);
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player is knocked out");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;

        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

}
