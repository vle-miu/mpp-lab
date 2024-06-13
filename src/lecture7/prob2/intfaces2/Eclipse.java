package lecture7.prob2.intfaces2;

public class Eclipse implements ClosedCurve {

    private double semiaxis;

    private double elateral;

    public Eclipse(double semiaxis, double elateral) {
        this.semiaxis = semiaxis;
        this.elateral = elateral;
    }

    @Override
    public double computePerimeter() {
        return 4 * semiaxis * elateral;
    }
}
