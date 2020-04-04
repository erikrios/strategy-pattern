package com.erikriosetiawan.client;

import com.erikriosetiawan.encapsulatedweaponbehavior.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    void fight() {
        System.out.println("The Troll is fight now");
    }
}
