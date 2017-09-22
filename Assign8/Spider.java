/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class Spider extends Monster{
    public Spider()
    {
        super();
    };
    public Spider(int x, int y , int health)
    {
        super(x, y, health);
    }
    @Override
    public void drawToMap(Map screen)
    {
        if(screen == null)
        {
        }
        else 
        {
            screen.setMapLocation(super.getX(), super.getY(), 's');
        }
    }
    
}
