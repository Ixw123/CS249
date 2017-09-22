/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;
import java.util.Scanner;

public class Assign6 {

public static void main(String[] args)
{
    boolean isUseable;
    int use, health;
    String query;
    //query = "No";
    String name;
    double weight, healing_Power;
    Player player = new Player( 3, 3);
    Scanner scanner = new Scanner(System.in);
    do 
    {
    System.out.println("Input item name and weight");
    name = scanner.next();
    if(name.equals("None"))
        break;
    weight = scanner.nextDouble();
    //System.out.println(query.length());
    System.out.println("Is the item a food item?");
    scanner.nextLine();
    query = scanner.nextLine();
    //scanner.nextLine();
    //System.out.println(query.length());
    if(query.charAt(0) == 'Y' || query.charAt(0) == 'y')
    {
        System.out.println("What is the healing power of this food?");
        healing_Power = scanner.nextDouble();
        scanner.nextLine();
        Food food = new Food(name, weight, healing_Power);
        player.addItem(food);
    }
    else
    {
        Item item = new Item(name, weight);
        player.addItem(item);
    }
    }while(!name.equals("none"));
    
    player.printInventory();
    System.out.println("Pick an item to use");
    use = scanner.nextInt();
    try
    {
        if(player.useItem(use))
    {
        System.out.println("Current health: " + player.getHealth());
    }
    else
    {
        System.out.println("Cannot use this item.");
    }
    
    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println("Cannot use this item.");
    }
    
}
}