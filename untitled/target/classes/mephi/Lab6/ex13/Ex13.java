package mephi.Lab6.ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex13 {
    public static <T> void minmax(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        if (elements.size() == 0) return;
        if (elements.size() == 1) {
            result.add(elements.get(0));
            result.add(elements.get(0));
            return;
        }
        elements.sort(comp);
        result.add(elements.get(0));
        result.add(elements.get(elements.size() - 1));
    }

    public static <T> void maxmin(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
        swapHelper(result, result.size() - 2, result.size() - 1);
    }

    public static <K> void swapHelper(List<K> a, int x, int y) {
        if (x == y) return;
        if (x >= a.size() || y >= a.size()) return;
        K t = a.get(x);
        a.add(x, a.get(y));
        a.remove(x+1);
        a.add(y, t);
        a.remove(y+1);
    }

    // For example this swapHelper has no generic type parameter that can be bound
    // i.e. that can capture a wildcard type
    public static void swapHelperNumber(List<Number> a, int x, int y) {
        if (x == y) return;
        if (x >= a.size() || y >= a.size()) return;
        Number t = a.get(x);
        a.add(x, a.get(y));
        a.remove(x+1);
        a.add(y, t);
        a.remove(y+1);
    }

    // and the compiler won't attempt to compile code in a context in which it
    // must bind a wildcard type but can't. This cannot be fixed by writing a
    // swapHelper for a specific type because the Comparator and List arguments
    // of maxminNumber have a generic wildcard so swapHelper must have a generic
    // type to capture it.
    public static <T> void maxminNumber(List<T> elements,
                                        Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
//     swapHelperNumber(result, result.size() - 2, result.size() - 1);
        // } error message:
        //   The method swapHelperNumber(List<Number>, int, int) in the type
        //   Ch0612ListMinMax is not applicable for the arguments
        //   (List<capture#13-of ? super T>, int, int)
        //
    }

    public static void main(String[] args) {

        ArrayList<Integer> ali1 = new ArrayList<>();
        ali1.add(1);
        ali1.add(2);
        ali1.add(3);
        ArrayList<Number> ali2 = new ArrayList<>();
        minmax(ali1, Integer::compare, ali2);
        System.out.println(ali2); // [1, 3]
        ArrayList<Number> ali3 = new ArrayList<>();
        maxmin(ali1, Integer::compare, ali3);
        System.out.println(ali3); // [3, 1]
    }
}
