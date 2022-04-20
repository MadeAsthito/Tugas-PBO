package com.tugas.inheritance;

// Merupakan class SUPER atau induk dari inheritance yang telah dibuat
public class Entity {
    int hp, ap, dmg, def, deflect, fullhp;
    String name;

    // Konstruktor
    public Entity(String name, int hp, int ap, int def) {
        this.name = name;
        this.fullhp = hp;
        this.hp = hp;
        this.ap = ap;
        this.def = def;
    }

    // Fitur Attack
    void attack(){
        this.dmg = ap;
        System.out.println(name + " is Attacking!");
        System.out.println(name + " deal " + dmg +" damage!");
    }

    // Fitur Defense
    void defense(){
        deflect = def;
        System.out.println(name + " is Defending!");
        System.out.println(name + " deflect " + deflect +" damage!");
    }

    // Fitur Status
    void status(){
        System.out.println(" NAME         : " + name);
        System.out.println(" HEALTH POINT : " + hp);
        System.out.println(" ATTACK POINT : " + ap);
        System.out.println(" DEFENSE      : " + def);
    }
}




