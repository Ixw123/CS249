
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class Player {
    IntegerProperty xProp = new SimpleIntegerProperty(0);
    IntegerProperty yProp = new SimpleIntegerProperty(0);
    
    public Player(int x, int y)
    {
        xProp.setValue(x);
        yProp.setValue(y);
    }
    public int getX()
    {
        return xProp.getValue();
    }
    public int getY()
    {
        return yProp.getValue();
    }
    public void setX(int x)
    {
        xProp.setValue(x);
    }
    public void setY(int y)
    {
        yProp.setValue(y);
    }
    public IntegerProperty getXProperty()
    {
        return(xProp);
    }
    public IntegerProperty getYProperty()
    {
        return(yProp);
    }
}
