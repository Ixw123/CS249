
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class Assign10 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public static void main(String[] args) {
        int humans;
        int orcs;
        int battleCnt = 0;
        Army gondor = new Army("Gondor");
        Army mordor = new Army("Mordor");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of humans and orc troops");
        humans = input.nextInt();
        orcs = input.nextInt();
        for(int i = 0; i < humans; i++)
        {   
            Human x = new Human();
            gondor.addSoldier(x);
        }
        for(int i = 0; i < orcs; i++)
        {
            Orc x = new Orc();
            mordor.addSoldier(x);
        }
        while(!gondor.isDefeated() && !mordor.isDefeated())
        {
            System.out.println("BATTLE " + battleCnt);
            gondor.attacks(mordor);
            mordor.attacks(gondor);
            System.out.println(gondor.toString());
            System.out.println(mordor.toString());
            battleCnt ++;
        }
        System.out.println(battleCnt + " BATTLES FOUGHT");
        if(!gondor.isDefeated())
            System.out.println(gondor.getName() + " is victorious!");
        else if(!mordor.isDefeated())
            System.out.println(mordor.getName() + " is victorious!");
        else 
            System.out.println("Both sides lost!");
    }
    
}
