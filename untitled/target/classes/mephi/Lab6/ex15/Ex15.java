package mephi.Lab6.ex15;

import java.util.ArrayList;
import java.util.function.Function;

public class Ex15 {
    public static <T, R> ArrayList<R> map(ArrayList<T> a, Function<T, R> f) {
        if (a.size() == 0) return null;
        ArrayList<R> b = new ArrayList<>(a.size());
        for (T t : a) b.add(f.apply(t));
        return b;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(20); ali.add(40); ali.add(80);
        ArrayList<Double> ald = map(ali, x -> x.doubleValue() / Math.E);
        System.out.println(ald);

    }
}
