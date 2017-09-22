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
public class Food extends Item{
        private double heals = 0;
    
    public Food(String name, double weight, double heals)
    {
        super(name, weight);
        this.heals = heals;
    }
    public double getHeals()
    {
        return(this.heals);
    }
    @Override
    public String toString()
    {
        return(super.toString() + "Healing Power: " + this.heals);
    }
}
