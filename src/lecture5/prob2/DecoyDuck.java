package lecture5.prob2;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }
}
