package mephi.Lab6.dop.presentation.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class CovInvContr {

    public static void main(String[] args) {
        //ArrayList<String> strings = new ArrayList<Object>();
        Object[] objects = new String[1]; //Массивы ковариантны

        ArrayList<Integer>integerList=new ArrayList<>();
        integerList.add(5);
        integerList.add(7);
        integerList.add(-4);

        ArrayList<? extends Number> numbers = integerList; //ковариантность

        Comparator<Object> comparator = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.hashCode()>o2.hashCode())
                        return 1;
                else return -1;
            }
        };
        integerList.sort(comparator); //контравариантность
        //ArrayList<String> strings = new ArrayList<Object>(); --инвариантность дженериков

    }


}
