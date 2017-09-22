/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;
import java.util.ArrayList;
/**
 *
 * @author T420
 */
public class Player{
    Item item = new Item();
    //Player class Data
    ArrayList<Item> inventory = new ArrayList<>();
    private int [] player_Pos = {0,0};
    private int player_Health = 100;
    private Weapon player_Weapon = null;
    
    //Player class Methods
    public Player()
    {
        
    }
    public Player(int X, int Y)
    {
        player_Pos[0] = X;
        player_Pos[1] = Y;
    }
    public int getX()
    {
        return(player_Pos[0]);
    }
    public int getY()
    {
        return(player_Pos[1]);
    }
    public int getHealth()
    {
        return(player_Health);
    }
    public Weapon getCurrentWeapon()
    {
        return(player_Weapon);
    }
    public void setCurrentWeapon(Weapon weapon)
    {
        player_Weapon = weapon;
        
    }
    public void setX(int x)
    {
        player_Pos[0] = x;
    }
    public void setY(int y)
    {
        player_Pos[1] = y;
    }
    public void setHealth(int health)
    {
        player_Health = health;
    }
    public void addItem(Item item)
    {
        inventory.add(item);
    }
    public boolean useItem(int index)
    {
      Item item_Picked = inventory.get(index);
      
      if(item_Picked instanceof Food )
      {
          inventory.remove(index);
          this.player_Health += ((Food) item_Picked).getHeals();
          return true;
      }
      return false;
    }
    public void printInventory()
    {
        for(int i = 0; i <=inventory.size() -1; i++)
        {
            System.out.println("IVENTORY:");
            System.out.println("Item " + i);
            System.out.println(inventory.get(i));
        }
    }
}