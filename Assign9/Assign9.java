import java.net.URL;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class Assign9 extends Application{
    
    @Override
    public void start(Stage primaryStage)
    {
        try
        {
               URL url = new URL("http://web.cs.sunyit.edu/~realemj/2017spring/cs249/files/Map01.txt");
               Scanner input = new Scanner(url.openStream());
               Map Map1 = new Map();
               Map1.load(input);
               MapPane mapPane1 = new MapPane(Map1);
               Pane displayPane = new Pane();
               displayPane.getChildren().add(mapPane1);
               Player player = new Player(5,5);
               PlayerPane playerPane = new PlayerPane(player);
               displayPane.getChildren().add(playerPane);
               Scene rootScene = new Scene(displayPane);
               rootScene.setOnKeyPressed(e -> {
                   int xCheck, yCheck;
                   xCheck = player.getX();
                   yCheck = player.getY();
                   switch (e.getCode())
                   {
                       case A:
                           xCheck --;
                           break;
                       case D:
                           xCheck ++;
                           break;
                       case W:
                           yCheck --;
                           break;
                       case S:
                           yCheck ++;
                           break;
                       default:
                           break;
                       }
                   if(Map1.canMoveTo(xCheck, yCheck))
                   {
                       player.setX(xCheck);
                       player.setY(yCheck);
                   }
               });
               primaryStage.setTitle("NetHack");
               primaryStage.setScene(rootScene);
               primaryStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            Platform.exit();
        }
    }
    public static void main(String [] args) 
    {
        launch(args);
    }

    
}
