package ej.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class InsteadOfAnonymousClass {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("The", "big", "brown", "Fox");

        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        //Collections.sort(words,
        //        (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.sort(comparingInt(String::length));
    }
}
