package com.erikriosetiawan.client;

import com.erikriosetiawan.encapsulatedweaponbehavior.KnifeBehavior;

public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    void fight() {
        System.out.println("The Queen is fight now");
    }
}
