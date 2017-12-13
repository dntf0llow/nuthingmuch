package client.logic;

import client.managers.FileManager;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class HexBoard {
    public static final int             ROWS            = 17;
    public static final int             COLUMNS         = 25;
    public static final int             HEX_SIZE        = 20;
    public static final double          OFFSET          = 2;
    public static final double          HEX_HEIGHT      = HEX_SIZE * 2;
    public static final double          HEX_WIDTH       = Math.sqrt(3)/2 * HEX_HEIGHT;
    public static final int             BOARD_HEIGHT    = (int)(HEX_HEIGHT / 2 * ROWS);
    public static final int             BOARD_WIDTH     = (int)((COLUMNS * (HEX_WIDTH + OFFSET)));

    private int amountOfPlayers = 0;


    private static HexBoard instance = null;



    public HexCell[][] board;

    private HexBoard() {
        board = new HexCell[COLUMNS][ROWS];
    }

    public void createBoard() {
        ArrayList<String> lines = (FileManager.readFile("src/main/resources/board.txt"));
        board = createBoardFromStrings(lines.toArray(new String[0]));
    }

    private HexCell[][] createBoardFromStrings(String[] lines) {
        HexCell[][] map = new HexCell[COLUMNS][ROWS];

        for (int r = 0; r < ROWS; r++) {
            for (int q = 0; q < COLUMNS; q++) {
                char currentChar = lines[r].charAt(q);
                if (currentChar == ' ') {
                    map[q][r] = new HexCell(q, r);

                    //TODO: Handle empty fields
                    continue;
                }
                map[q][r] = new HexCell(q, r);
            }
        }

        return map;
    }

    public static HexBoard getInstance() {
        if (instance == null)
            return new HexBoard();
        return instance;
    }

    public void setAmountOfPlayers(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }
}
