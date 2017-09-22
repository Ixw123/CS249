import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class MapPane extends Pane{
    public final static int TILE_WIDTH = 32;
    public final static int TILE_HEIGHT = 32;
    private Map currentMap;
    
    private class Tile extends Rectangle
    {
      
      Tile(double x, double y, char type)
      {
          super(x, y, TILE_WIDTH, TILE_HEIGHT);
          
          switch (type)
              
          {
              case ' ':
                  setFill(Color.BLACK);
                  break;
              case '#':
                  setFill(Color.GRAY);
                  break;
              case '.':
                  setFill(Color.LIGHTGRAY);
                  break;
          }
          
      }
      
    }  
    
    MapPane(Map map)
    {
        currentMap = map;
        for(int i = 0; i < currentMap.getRows(); i++)
            for(int j = 0; j < currentMap.getColumns(); j++)
            {
                 Tile tile = new Tile(j*TILE_WIDTH, i*TILE_HEIGHT, currentMap.getMapLocation(j,i));
                 getChildren().add(tile);
            }
    }
    
    
}