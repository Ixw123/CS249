
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 * @param <E>
 */
public class Army<E extends Unit>{
    private ArrayList <E> soldiers = new ArrayList<>();
    private String name;
    
    public Army(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void addSoldier(E x)
    {
        soldiers.add(x);
    }
    public void removeSoldier(E x)
    {
        soldiers.remove(x);
    }
    public E getSoldier(int index)
    {
        return(soldiers.get(index));
    }
    public int getSoldierCnt()
    {
        return(soldiers.size());
    }
    public boolean isDefeated()
    {
        if(soldiers.isEmpty())
            return true;
        else
            return false;
    }
    @Override
    public String toString()
    {
        String army = "";
        army += name + ": ";
        for(int i = 0; i < soldiers.size(); i++)
            army += soldiers.get(i).toString();
        return(army);
    } 
    public <T extends Unit> void attacks(Army<T> other)
    {
        T otherSoldier;
        ArrayList<E> deathToll = new ArrayList<> ();
        if(!other.isDefeated() && !soldiers.isEmpty())
        {
            for(int i = 0; i < soldiers.size(); i++)
            {
                if(other.isDefeated())
                    break;
                otherSoldier = other.getSoldier((int)(Math.random() *(other.getSoldierCnt()))) ;
                soldiers.get(i).attack(otherSoldier);
                if(!otherSoldier.isAlive())
                    other.removeSoldier(otherSoldier);
                else
                {
                    otherSoldier.attack(soldiers.get(i));
                    if(!soldiers.get(i).isAlive())
                        deathToll.add(soldiers.get(i));
                }
            }
            soldiers.removeAll(deathToll);
        }
    }
}
