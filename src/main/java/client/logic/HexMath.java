package client.logic;

import java.util.ArrayList;
import java.util.List;

//TODO: Singleton
public class HexMath {
    public static List<HexPoint> DIRECTIONS = new ArrayList() {
        {
            new HexPoint(1, -1, 0); new HexPoint(-1, 1, 0);
            new HexPoint(1, 0, -1); new HexPoint(0, 1, -1);
            new HexPoint(-1, 0, 1); new HexPoint(0, -1, 1);
        }
    };

    public static double getDistanceBetween(HexCell a, HexCell b) {
        return getDistanceBetween(a.point, b.point);
    }

    public static double getDistanceBetween(HexPoint p1, HexPoint p2) {
        return (Math.abs(p1.q - p2.q) + Math.abs(p1.r - p2.r) + Math.abs(p1.s - p2.s));
    }

    public static HexPoint getDirectionFromTo(HexCell from, HexCell to) {
        return getDirectionFromTo(from.point, to.point);
    }

    public static HexPoint getDirectionFromTo(HexPoint from, HexPoint to) {
        return (HexMath.substractPoints(to, from));
    }

    public static HexPoint substractPoints(HexPoint a, HexPoint b) {
        return new HexPoint(a.q - b.q, a.r - b.r, a.s - b.s);
    }

    public static HexPoint addPoints(HexPoint a, HexPoint b) {
        return new HexPoint(a.q + b.q, a.r + b.r, a.s + b.s);
    }

    public static HexPoint scalarMultiply(HexPoint point, double scalar) {
        return new HexPoint(point.q * scalar, point.r * scalar, point.s * scalar);
    }

    public static HexPoint[] getNeighbors(HexPoint point) {
        HexPoint[] neighbors = new HexPoint[DIRECTIONS.size()];
        for (int i = 0; i < DIRECTIONS.size(); i++) {
            neighbors[i] = HexMath.addPoints(point, DIRECTIONS.get(i));
        }

        return neighbors;
    }


}
