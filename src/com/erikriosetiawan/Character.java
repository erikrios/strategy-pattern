package com.erikriosetiawan;

public class Character {

    WeaponBehavior weapon;

    public void fight() {
        System.out.println("The character is fight");
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
