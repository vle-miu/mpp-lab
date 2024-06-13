package lecture7.prob2.intfaces2;

public class EQTriangle implements Polygon {

    private double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getLengths() {
        return new double[] { side, side, side };
    }
}
