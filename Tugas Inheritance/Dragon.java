package com.tugas.inheritance;

// Class Human, yang mengatur races DRAGON dan merupakan anak / child dari ENTITY
public class Dragon extends Entity{
    // Konstruktor
    public Dragon(String name, int hp, int ap, int def) {
        super(name, hp, ap, def);
    }

    // Fitur DRAGON SKILL, Dragon Breath
    void breath(){
        this.dmg = 10000;
        System.out.println(name + " is using Dragon Breath!");
        System.out.println(name + " deal " + dmg +" damage!");
    }
}
