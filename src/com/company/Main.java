package com.company;

public class Main {

    public static void main(String[] args) {
        Boss skeletBoss = new Boss();
        skeletBoss.setHealth(300);
        skeletBoss.setDamage(70);
skeletBoss.setProtectionType("Fair");
        System.out.println("Health Boss = "+ skeletBoss.getHealth());
        System.out.println("Damage Boss = "+ skeletBoss.getDamage());
        System.out.println("Defence boss from "+skeletBoss.getProtectionType());
    }
}
