/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public abstract class Unit {
    private int attack;
    private int health;
    private boolean alive;
    private String name;
    
    public Unit(String name, int attack, int health)
    {
        this.name = name;
        this.attack = attack;
        this.health = health;
        alive = true;
    }
    public int getAttack()
    {
        return(attack);
    }
    public int getHealth()
    {
        return(health);
    }
    public boolean isAlive()
    {
        return(alive);
    }
    public String getName()
    {
        return(name);
    }
    @Override
    public String toString()
    {
        return(name + ":" + health + " ");
    }
    public int attack(Unit other)
    {
        int damage;
        if(this.isAlive() && other.isAlive())
        {
            damage = (int)(Math.random() * (this.attack) +1) ;
            other.health = other.getHealth() - damage;
            if(other.getHealth() <= 0)
            {
                other.health = 0;
                other.alive = false;
            }
        }
        else
            return 0;
        return damage;
    }

}
