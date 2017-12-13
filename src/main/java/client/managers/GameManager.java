package client.managers;

import client.dep.CheckerBoard;
import client.logic.HexBoard;
import client.logic.Player;

import java.util.ArrayList;

public class GameManager {
    private int numberOfPlayers;

    private HexBoard board;

    private ArrayList<Player> players = new ArrayList<>();

    public GameManager() {
        board = HexBoard.getInstance();
    }

    private void setBoardAmountOfPlayers(int players) {
        HexBoard.getInstance().setAmountOfPlayers(players);
    }

    public HexBoard getBoard() {
        return board;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        setBoardAmountOfPlayers(numberOfPlayers);
    }
}
