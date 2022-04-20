package com.tugas.inheritance;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int pil;
        int count = 0;
        int status = 1;
        String namaPlayer, namaPlayer2;
        Scanner input = new Scanner(System.in);

        // Menu Awal, dan menu untuk menerima nickname untuk HUMAN dan DRAGON
        System.out.println("======= BATTLE SIMULATION ======");
        System.out.println("         HUMAN vs DRAGON");
        System.out.println("--------------------------------");
        System.out.println(" Player Human  :");
        System.out.print(" Nickname : ");
        namaPlayer = input.nextLine();
        Human player = new Human(namaPlayer, 2000, 1000, 500);
        System.out.println("--------------------------------");
        System.out.println(" Player Dragon :");
        System.out.print(" Nickname : ");
        namaPlayer2 = input.nextLine();
        Dragon player2 = new Dragon(namaPlayer2, 10000, 10000, 10000);
        System.out.println("================================");

        do {
            // Menghitung TURN keberapa simulasi battle ini
            count = count + 1;
            System.out.println(" * TURN " + count );
            // HUMAN menu
            System.out.println("======= BATTLE SIMULATION ======");
            System.out.println("------------ HUMAN -------------");
            player.status();
            System.out.println("------------ DRAGON ------------");
            player2.status();
            System.out.println("================================");
            System.out.println(" HUMAN [" + player.name + "] turn");
            System.out.println(" 1. Attack");
            System.out.println(" 2. Defense");
            System.out.println(" 3. Overdrive");
            System.out.println("--------------------------------");
            System.out.println(" 0. Exit");
            System.out.println("================================");
            System.out.print(" Move : ");
            pil = input.nextInt();
            System.out.println("================================");
            if (pil == 1) {
                player.attack();
                player2.hp = player2.hp - player.dmg;
            }
            else if (pil == 2) {
                player.defense();
                if(player.hp != player.fullhp) {
                    player.hp = player.hp + player.deflect;
                    if(player.hp > player.fullhp){
                        player.hp = player.fullhp;
                    }
                }
            }
            else if(pil == 3){
                player.overdrive();
            }
            else if(pil == 0){
                System.exit(0);
            }
            System.out.println("================================");

            // Pengecekkan HP
            if(player2.hp <= 0){
                status = 0;
                System.out.println(player2.name + " HP is 0, " + player2.name + " the Dragon is dead!!!");
                System.out.println("--------------------------------");
                System.out.println(" Congratulations " + player.name + ", You WIN!!!");
            }
            if(player.hp <= 0){
                status = 0;
                System.out.println(player.name + " HP is 0, " + player.name + " the Human is dead!!!");
                System.out.println("--------------------------------");
                System.out.println(" Congratulations " + player2.name + ", You WIN!!!");
            }
            // Jika HP masih ada, lanjut untuk turn DRAGON
            if(status == 1) {
                // DRAGON menu
                System.out.println("======= BATTLE SIMULATION ======");
                System.out.println("------------ HUMAN -------------");
                player.status();
                System.out.println("------------ DRAGON ------------");
                player2.status();
                System.out.println("================================");
                System.out.println(" DRAGON [" + player2.name + "] turn");
                System.out.println(" 1. Attack");
                System.out.println(" 2. Defense");
                System.out.println(" 3. Dragon Breath");
                System.out.println("--------------------------------");
                System.out.println(" 0. Exit");
                System.out.println("================================");
                System.out.print(" Move : ");
                pil = input.nextInt();
                System.out.println("================================");
                if (pil == 1) {
                    player2.attack();
                    player.hp = player.hp - player2.dmg;
                } else if (pil == 2) {
                    player2.defense();
                    if (player2.hp != player2.fullhp) {
                        player2.hp = player2.hp + player2.deflect;
                        if (player2.hp > player2.fullhp) {
                            player2.hp = player2.fullhp;
                        }
                    }
                } else if (pil == 3) {
                    player2.breath();
                } else if (pil == 0) {
                    System.exit(0);
                }
                System.out.println("================================");

                // Pengecekkan HP
                if (player2.hp <= 0) {
                    status = 0;
                    System.out.println(player2.name + " HP is 0, " + player2.name + " the Dragon is dead!!!");
                    System.out.println("--------------------------------");
                    System.out.println(" Congratulations " + player.name + ", You WIN!!!");
                }
                if (player.hp <= 0) {
                    status = 0;
                    System.out.println(player.name + " HP is 0, " + player.name + " the Human is dead!!!");
                    System.out.println("--------------------------------");
                    System.out.println(" Congratulations " + player2.name + ", You WIN!!!");
                }
            }
            System.out.println("\n");
        }while(status != 0);
    }
}
