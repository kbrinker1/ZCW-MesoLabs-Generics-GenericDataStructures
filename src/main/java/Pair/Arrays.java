package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {


    public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        E first = a.get(0);
        E last = a.get(a.size()-1);
        Pair pair = new Pair (first, last);
        return pair;
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> al) {
        return Collections.min(al);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> al) {
        return Collections.max(al);
    }

    public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> al) {
        E minVal = Collections.min(al);
        E maxVal = Collections.max(al);
        Pair minMaxValues = new Pair (minVal, maxVal);
        return minMaxValues;
    }
}
