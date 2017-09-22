/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;


public class Weapon {
    
    //Class Data(Attributes)
    private String weapon_Name = "";
    private int weapon_Damage = 0;
    
    //Class Methods

    public Weapon(String name, int damage)
    {
        weapon_Name = name;
        weapon_Damage = damage;
    }
    public String getName()
    {
        return(weapon_Name);
    }
    public int getDamage()
    {
        return(weapon_Damage);
    }
    public void setName(String name)
    {
        weapon_Name = name;
    }
    public void setDamage(int damage)
    {
        weapon_Damage = damage;
    }
    public static void printWeapon(Weapon weapon)
    {
        if(weapon == null)
            System.out.println("No Weapon");
        else
            System.out.println(weapon.weapon_Name);
    }
}
