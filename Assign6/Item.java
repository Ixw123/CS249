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
public class Item {
    private String name = "";
    private double weight = 0;
    
    public Item()
    {

    }
    public Item(String name, double weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public String getName()
    {
        return(this.name);
    }
    public double getWeight()
    {
        return(this.weight);
    }
    @Override
    public String toString()
    {
        return("Name: " + this.name + '\n' + "Weight: " + this.weight + '\n');
    }
}
