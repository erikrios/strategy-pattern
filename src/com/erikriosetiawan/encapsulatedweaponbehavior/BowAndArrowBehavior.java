package com.erikriosetiawan.encapsulatedweaponbehavior;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Attack with Bow and Arrow");
    }
}
