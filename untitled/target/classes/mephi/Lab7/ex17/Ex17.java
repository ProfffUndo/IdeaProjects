package mephi.Lab7.ex17;

import java.util.*;

public class Ex17 {
    public static void main(String[] args) {
        @SuppressWarnings({ "unchecked" })
        ArrayList<Integer> uncheckedList = (ArrayList<Integer>) ((Object) new ArrayList<String>(
                Arrays.asList("string1","string2")));
        System.out.println(uncheckedList); // [string1,string2]
        uncheckedList.add(1); //
        System.out.println(uncheckedList); // [string1, string2, 1]
        // uncheckedList.add("string"); // Требует интегер
        // Integer u0 = uncheckedList.get(0); //Здесь класс каст
        // System.out.println(u0); //
        // String u0 = uncheckedList.get(0); // Не может конвертировать из инта в стринг
        Integer u1 = uncheckedList.get(2);
        System.out.println(u1);


        //CheckedList сразу выдаст исключение при попытке каста листа другого типа, таким образом предотвращая heap pollution
        List<Integer> checkedList = Collections.checkedList(new ArrayList<>(), Integer.class);
        Object p = checkedList;
        @SuppressWarnings({"unchecked"})
        ArrayList<String> t = (ArrayList<String>) p; // causes java.lang.ClassCastException

    }
}
