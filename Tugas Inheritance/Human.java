package com.tugas.inheritance;

// Class Human, yang mengatur races HUMAN dan merupakan anak / child dari ENTITY
public class Human extends Entity {
    // Konstruktor
    public Human(String name, int hp, int ap, int def) {
        super(name, hp, ap, def);
    }

    // Fitur HUMAN SKILL, Overdrive
    void overdrive(){
        hp = 1;
        ap = ap+10000;
        System.out.println(name + " is using Overdrive!");
        System.out.println(name + " increase 10000 ap, but " + name + " is barely standing!");
    }
}
