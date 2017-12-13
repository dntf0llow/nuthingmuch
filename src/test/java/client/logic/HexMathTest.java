package client.logic;

import static org.junit.Assert.*;

public class HexMathTest {
    @org.junit.Test
    public void getDistanceBetween() throws Exception {
        HexPoint p1 = new HexPoint(1, 3, 5);
        HexPoint p2 = new HexPoint(2, 4,6);

        assertTrue(HexMath.getDistanceBetween(p1, p2) == 3);
    }

    @org.junit.Test
    public void getDirectionFromTo() throws Exception {
        HexPoint p1 = new HexPoint(2, 1, 0);
        HexPoint p2 = new HexPoint(-1, 0, 2);

        assertEquals(new HexPoint(-3, -1, 2), HexMath.getDirectionFromTo(p1, p2));
    }

    @org.junit.Test
    public void substractPoints() throws Exception {
        HexPoint p1 = new HexPoint(-2, 0, 7);
        HexPoint p2 = new HexPoint(5, -3, -14);

        assertEquals(new HexPoint(-7, 3, 21), HexMath.substractPoints(p1, p2));
    }

    @org.junit.Test
    public void scalarMultiply() throws Exception {
        HexPoint point = new HexPoint(0, -3, 4);
        double scalar = 2;

        assertEquals(new HexPoint(0, -6, 8), HexMath.scalarMultiply(point, scalar));

    }

    @org.junit.Test
    public void addPoints() throws Exception {
        HexPoint p1 = new HexPoint(-2, 0, 7);
        HexPoint p2 = new HexPoint(5, -3, -14);

        assertEquals(new HexPoint(3, -3, -7), HexMath.addPoints(p1, p2));
    }

    @org.junit.Test
    public void findNeighbors() throws Exception {
        HexPoint point = new HexPoint(0,0,0);

        assertArrayEquals(HexMath.DIRECTIONS.toArray(), HexMath.getNeighbors(point));
    }

}