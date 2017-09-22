
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
public abstract class Monster implements Loadable, Drawable{
    private int x, y, health;
    protected Monster(){};
    protected Monster(int x, int y, int health)
    {
        this.x = x;
        this.y = y;
        this.health = health;
    }
    public int getX()
    {
        return(this.x);
    }
    public int getY()
    {
        return(this.y);
    }
    public int getHealth()
    {
        return(this.health);
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    @Override
    public void load(Scanner input)
    {
        this.x = input.nextInt();
        this.y = input.nextInt();
        this.health = input.nextInt();
    }
    public void drawToMap(Map screen){};
}
