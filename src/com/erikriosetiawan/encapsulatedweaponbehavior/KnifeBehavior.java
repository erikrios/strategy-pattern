package com.erikriosetiawan.encapsulatedweaponbehavior;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Attack with knife");
    }
}
