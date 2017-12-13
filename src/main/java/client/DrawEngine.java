package client;

import client.dep.CheckerBoard;
import client.logic.HexBoard;
import client.logic.Point;
import javafx.scene.shape.Polygon;

public class DrawEngine {

    public Polygon getDrawableShape(int x, int y) {
        Polygon poly = new Polygon();
        for (int i = 0; i < 6; i ++) {
            int angleDeg = 60 * i + 30;
            double angleRad = Math.PI / 180 * angleDeg;
            double centerX = x * HexBoard.HEX_WIDTH + HexBoard.HEX_WIDTH / 2;
            double centerY = HexBoard.HEX_SIZE + y * HexBoard.HEX_HEIGHT * 3/4 ;
            Point p = new Point(centerX + HexBoard.HEX_SIZE * Math.cos(angleRad), centerY + HexBoard.HEX_SIZE * Math.sin(angleRad));
            poly.getPoints().addAll(p.x, p.y);
        }

        return poly;
    }


}
