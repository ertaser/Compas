package Ru.Compass.logic;

public class Compas {
    private String side;
    private int degreeA;
    private int degreeB;


    public Compas(){super();}
    public Compas(String side, int degreeA, int degreeB) {
        this.side = side;
        this.degreeA = degreeA;
        this.degreeB = degreeB;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getDegreeA() {
        return degreeA;
    }

    public void setDegreeA(int degreeA) {
        this.degreeA = degreeA;
    }

    public int getDegreeB() {
        return degreeB;
    }

    public void setDegreeB(int degreeB) {
        this.degreeB = degreeB;
    }
}
