package com.erikriosetiawan.client;

import com.erikriosetiawan.encapsulatedweaponbehavior.BowAndArrowBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    void fight() {
        System.out.println("The knight is fight now");
    }
}
