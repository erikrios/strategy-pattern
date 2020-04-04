package com.erikriosetiawan.client;

import com.erikriosetiawan.encapsulatedweaponbehavior.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    void fight() {
        System.out.println("The king is fight now");
    }
}
