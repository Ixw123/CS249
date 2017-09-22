import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael J. Reale
 */
public class Assign8 {
    public static void main(String [] args) {
	
	try {
	    Scanner inputUser = new Scanner(System.in);
	    System.out.println("Enter level number");
	    String levelName = inputUser.next();
	    
	    Scanner mapFile = new Scanner(new File("Map" + levelName + ".txt"));
	    Map baseMap = new Map();
	    baseMap.load(mapFile);
	    
	    System.out.println("Map has " + baseMap.getRows() + " rows and " + baseMap.getColumns() + " columns.");
	    
	    Scanner inputMonsters = new Scanner(new File("Monsters" + levelName + ".txt"));
	    
	    int numMonsters = inputMonsters.nextInt();
	    ArrayList<Monster> allMonsters = new ArrayList<Monster>();
	    for(int i = 0; i < numMonsters; i++) {
		String typeMonster = inputMonsters.next();
		
		Monster m = null;
		
		switch(typeMonster) {
		    case "Orc":
			m = new Orc();
			break;
		    case "Spider":
			m = new Spider();
			break;
		    default:
			break;
		}
		
		if(m != null) {
		    m.load(inputMonsters);
		    allMonsters.add(m);
		}	
	    }
	    
	    for(int i = 0; i < allMonsters.size(); i++) {
		allMonsters.get(i).drawToMap(baseMap);
	    }
	    
	    baseMap.draw();    
	}
	catch(Exception e) {
	    System.err.println("Game error");
	    e.printStackTrace();
	}
    }
}
