package lecture7.prob2.intfaces2;

public interface Polygon extends ClosedCurve {

    double[] getLengths();

    default double computePerimeter() {
        double sum = 0.0;
        for (double x : getLengths()) {
            sum += x;
        }
        return sum;
    }
}
