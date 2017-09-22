/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

import java.util.Scanner;

/**
 *
 * @author T420
 */
public class Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Weapon common_Sword;
        Weapon cool_Sword;
        //Weapon no_Weapon;
        Player player;
        String name;
        int damage;
        common_Sword = new Weapon("Common Sword", 50);
        cool_Sword = new Weapon("Glamdring, the Foe-Hammer", 1500);
        //no_Weapon = new Weapon("No weapon", 0);
        player = new Player(100, 100);
        //player.setCurrentWeapon(no_Weapon);
        //no_Weapon = player.getCurrentWeapon();
        Weapon.printWeapon(player.getCurrentWeapon());
        player.setCurrentWeapon(common_Sword);
        Weapon.printWeapon(player.getCurrentWeapon());
        player.setCurrentWeapon(cool_Sword);
        Weapon.printWeapon(player.getCurrentWeapon());
        
    }
    
}
