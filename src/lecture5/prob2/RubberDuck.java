package lecture5.prob2;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }
}
