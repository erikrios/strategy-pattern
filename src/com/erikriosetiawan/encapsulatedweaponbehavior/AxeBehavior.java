package com.erikriosetiawan.encapsulatedweaponbehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Attack with Axe");
    }
}
