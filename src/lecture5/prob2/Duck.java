package lecture5.prob2;

public class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void display() {
        System.out.println("Displaying");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
