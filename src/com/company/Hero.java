package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;


    public String getSuperpower() {
        return superPower;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;


    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;


    }
}
