package ej.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericMethod {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
