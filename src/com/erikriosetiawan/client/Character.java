package com.erikriosetiawan.client;

import com.erikriosetiawan.encapsulatedweaponbehavior.WeaponBehavior;

abstract class Character {

    WeaponBehavior weapon;

    abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
