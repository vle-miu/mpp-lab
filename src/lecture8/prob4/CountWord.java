package lecture8.prob4;

import java.util.Arrays;
import java.util.List;

public class CountWord {

    public static void main (String [] args) {
        List<String> words = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Nora", "Scott");
        char c = 'a';
        char d = 'e';
        int len = 5;

        int result = countWords(words, c, d, len);
        System.out.println("Number of words: " + result);
    }

    private static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(e -> e.length() == len)
                .filter(e -> e.indexOf(c) >= 0)
                .filter(e -> e.indexOf(d) < 0)
                .count();
    }
}
