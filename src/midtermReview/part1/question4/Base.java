package midtermReview.part1.question4;

import midtermReview.part1.question4.Extension;

public class Base extends Extension {

    public static void main(String[] args) {
        Extension s = new Base();
        s.print();
    }

    public void print() {
        System.out.println("From Base");
    }
}
