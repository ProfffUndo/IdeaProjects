package mephi.Lab6.dop.dopofdop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static <T> List<T> test1 (A<? extends T> a, int i){ //producer
        T n = a.call1(i);
        return Stream.generate(()->n).limit(i).collect(Collectors.toList());
    }
    public static <T> int test2(B<? super T> b, T o){
        return b.call2(o);
    } //consumer

    public static int test3(C<?> c, String o){
        return c.call4(o);
    } //nothing
}
