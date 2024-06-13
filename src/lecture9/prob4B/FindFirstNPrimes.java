package lecture9.prob4B;

import java.util.stream.Stream;

public class FindFirstNPrimes {

    public static void main(String[] args) {
        FindFirstNPrimes ps = new FindFirstNPrimes();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    private void printFirstNPrimes(int n) {
        primesStream().limit(n).forEach(System.out::println);
    }

    private static Stream<Integer> primesStream() {
        return Stream.iterate(2, FindFirstNPrimes::nextPrime);
    }

    private static int nextPrime(int n) {
        n += 1;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
