package ej.generics;

import java.util.ArrayList;
import java.util.List;

public class ListsVsArrays {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in";

        /* will not compile
        /List<Object> ol = new ArrayList<Long>(); // Incompatible types
        ol.add("I don't fit in");
        */
    }

}
