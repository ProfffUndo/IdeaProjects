package mephi.Lab6.dop.presentation.task2;

import mephi.Lab6.ex01.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.IntFunction;

public class GenericsProblems {
    //1 Нет приметивных типов
    //Stack<int> stack = new Stack<>(); Type argument cannot be of primitive type
    Stack<Integer> stack = new Stack<>();

    //2  все типы оказываются базовыми
    Object result = new String[]{"123", "235"}; //нельзя выяснить, содержит ли списочный массив типа A r r a y L i s t объекты типа S t r in g .
    @SuppressWarnings("unchecked")
    ArrayList<String> list = (ArrayList<String>) result;

    //3 Нельзя получить экземпляры обобщенных типов
   /* public static <T> T[] repeat(int n, T obj) {
        T [] result = new T[n]; // построить массив new T[] нельзя
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }*/
    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T [ ] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }

    String[] greetings = repeat(10, "Hi", String[]::new);

    //4 Нельзя построить массивы параметризированных типов
    //Map.Entry<String, Integer>[] entries = new Map.Entry<String, Integer>[100];Generic array creation
    ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(100);

    //5. Нельзя употреблять параметры типа класса в статическом контексте
/*    public class Entry<K, V> {
        private static V defaultValue;
      в стираемом классе E n t r y имеется лишь одна такая переменная или метод,
      а не по одному из них для каждого параметра типа К и V
        public static void setDefault(V value) { defaultValue = value; }
    }*/

    //6.Методы не должны конфликтовать после стирания
    /*public interface Ordered<T> extends Comparable<T> {
        public default boolean equals(T value) { //конфликт с методом Object, equals () !
         }
    }
     */

    //7.Exceptions
   // public class Problem<T> extends Exception Generic class may not extend 'java.lang.Throwable'


}
