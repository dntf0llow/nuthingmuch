package client;

import client.controllers.GameController;
import client.managers.GameManager;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GameScene extends Scene {

    private GameController controller;
    private Group rootBoard;

    private final Color[] colors = new Color[]{Color.WHITE,
            Color.LIGHTBLUE, Color.LIGHTGREEN, Color.LIGHTPINK,
            Color.LIGHTCORAL, Color.LIGHTYELLOW, Color.STEELBLUE
    };

    public GameScene(Parent root, double width, double height, GameManager manager) {
        super(root, width, height);
        init(root, manager);
    }
    public GameScene(Parent root, GameManager manager) {
        super(root);
        init(root, manager);
    }


    private void init(Parent root, GameManager manager) {
        rootBoard = (Group) root;

        controller= new GameController();
        controller.setGameManager(manager);

       manager.getBoard().createBoard();
    }

    public void drawScene() {

    }
}
