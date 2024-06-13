package lecture9.prob4A;

import java.util.stream.Stream;

public class PrimeNumberGenerator {

    public static void main(String[] args) {
        Stream<Integer> primes = Stream.iterate(2, PrimeNumberGenerator::nextPrime).limit(10);
        System.out.println(primes.toList());
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
