import java.net.MalformedURLException;
import java.net.URL;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class PlayerPane extends Pane{
    Player playerState;
    PlayerPane(Player player)
    {
        playerState = player;
        ImageView imageView = new ImageView("http://web.cs.sunyit.edu/~realemj/2017spring/cs249/files/char.png");
        imageView.setFitWidth(MapPane.TILE_WIDTH);
        imageView.setFitHeight(MapPane.TILE_HEIGHT);
        getChildren().add(imageView);
        this.translateXProperty().bind(playerState.getXProperty().multiply(MapPane.TILE_WIDTH));
        this.translateYProperty().bind(playerState.getYProperty().multiply(MapPane.TILE_HEIGHT));
    }
    
}
