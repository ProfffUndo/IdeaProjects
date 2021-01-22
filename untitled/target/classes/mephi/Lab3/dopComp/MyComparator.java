package mephi.Lab3.dopComp;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public interface MyComparator<T> {
    int compare(T var1, T var2);

    public static MyComparator<MyEmployee> comparing(Function<MyEmployee, String> function) {
        return (c1, c2) -> function.apply(c1).compareTo(function.apply(c2));
    }

    public static MyComparator<MyEmployee> comparing(Function<MyEmployee, String> function, MyComparator<String> comparator) {
        return (c1, c2) -> comparator.compare(function.apply(c1),function.apply(c2));
    }

    public default MyComparator<T> thenComparing(Function<T,String> newfunction){
        return (MyComparator<T>)(c1,c2)->{
            int result = compare(c1,c2);
            return (result!=0) ? result : newfunction.apply(c1).compareTo(newfunction.apply(c2));
        };
    }


    public static MyComparator comparingInt(ToIntFunction<MyEmployee> function){
        return (MyComparator<MyEmployee>) (c1, c2) -> Integer.compare(function.applyAsInt(c1),function.applyAsInt(c2));
    }

    public static MyComparator comparingDouble(ToDoubleFunction<MyEmployee> function){
        return (MyComparator<MyEmployee>) (c1, c2) -> Double.compare(function.applyAsDouble(c1),function.applyAsDouble(c2));
    }

    public default MyComparator<T> reversed(){
        return (c1,c2)-> this.compare(c2,c1);
    }
    public default MyComparator<String> naturalOrder(){return (c1,c2)->c1.compareTo(c2);}

    public default MyComparator<T> nullsFirst() {
        return (c1, c2) -> {
             if ((c1 == null) && (c2 == null)) {
                 return 0;
             } else if ((c1 == null) && (c2 != null)) {
                 return -1;
             } else if ((c1 != null) && (c2 == null)) {
                 return 1;
             } else {
                 return compare(c1,c2);
                }
            };
    }


    public default Comparator<T> toComparator(MyComparator comp) {
        Comparator<T> comp2 = (var1, var2)->this.compare(var1,var2);
        return comp2;
    }

}