/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author T420
 */
public class Player{
    
    //Player class Data
    private int [] player_Pos = {0,0};
    private int player_Health;
    private Weapon player_Weapon = null;
    
    //Player class Methods
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
}