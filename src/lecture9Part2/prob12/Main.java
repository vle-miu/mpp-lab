package lecture9Part2.prob12;

public class Main {

    public static void main(String[] args) {
        MySingletonLazy singletonLazy1 = MySingletonLazy.getInstance();
        MySingletonLazy singletonLazy2 = MySingletonLazy.getInstance();
        System.out.println(singletonLazy1 == singletonLazy2);
    }
}
