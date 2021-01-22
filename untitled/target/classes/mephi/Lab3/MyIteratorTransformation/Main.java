package mephi.Lab3.MyIteratorTransformation;

import mephi.Lab3.MyFilterIterator.MyFilterIterator;
import mephi.Lab3.dopComp.MyEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MyEmployee[] employees = {new MyEmployee("Alexander", "Koromyslov", 400),
                new MyEmployee("Michael", "Jordan", 500),
                new MyEmployee("David", "Beckham", 600),
                new MyEmployee("Elton", "John", 700)};


        List<MyEmployee> testArr = new ArrayList<MyEmployee>(Arrays.asList(employees));
        Iterator realIterator = testArr.iterator();

        Function<MyEmployee, String> function = MyEmployee::getLastName;
        Function<MyEmployee, String> function2 = (a) -> {return a.getFirstName();};
        Consumer consumer = x-> System.out.println(x.toString());

        MyTransIterator<MyEmployee, String> myIter = new MyTransIterator(realIterator);
        myIter.map(function);

//        System.out.println("Test 2");
  //      myIter.forEach(consumer);

        System.out.println("Test 1");
        while(myIter.hasNext()) {
            System.out.println(myIter.next());
        }


    }
}
