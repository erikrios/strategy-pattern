package com.erikriosetiawan;

import com.erikriosetiawan.client.*;
import com.erikriosetiawan.client.Character;
import com.erikriosetiawan.encapsulatedweaponbehavior.BowAndArrowBehavior;
import com.erikriosetiawan.encapsulatedweaponbehavior.SwordBehavior;
import com.erikriosetiawan.encapsulatedweaponbehavior.WeaponBehavior;

public class Main {

    public static void main(String[] args) {

        // Create the instance of King class
        Character king = new King();

        // Create the instance of Knight class
        Character knight = new Knight();

        // Create the instance of Queen class
        Character queen = new Queen();
        // Change the queen weapon
        queen.setWeapon(new SwordBehavior());

        // Create the instance of Troll class
        Character troll = new Troll();
        // Change the troll weapon
        WeaponBehavior trollWeapon = new BowAndArrowBehavior();
        troll.setWeapon(trollWeapon);
    }
}
