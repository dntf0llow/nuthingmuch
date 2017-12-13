package client.logic;

public class HexPoint {

    public double q;
    public double r;
    public double s;

    public HexPoint(double q, double r) {
        this(q, r, -q-r);
    }

    public HexPoint(double q, double r, double s) {
        this.q = q;
        this.r = s;
        this.s = s;
    }

    public boolean equals(Object other){
        if (!(other instanceof HexPoint))
            return false;
        HexPoint p = (HexPoint)other;
        return this.q == p.q && this.r == p.r && this.s == p.s;
    }
}
