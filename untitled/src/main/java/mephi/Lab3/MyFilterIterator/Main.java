package mephi.Lab3.MyFilterIterator;

import mephi.Lab3.dopComp.MyEmployee;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MyEmployee[] employees = {new MyEmployee("Alexander", "Koromyslov", 400),
                new MyEmployee("Michael", "Jordan", 500),
                new MyEmployee("David", "Beckham", 600),
                new MyEmployee("Elton", "John", 700)};


        List<MyEmployee> testArr = new ArrayList<MyEmployee>(Arrays.asList(employees));
        Iterator realIterator = testArr.iterator();
        Predicate<MyEmployee> predLastName = (MyEmployee myEm) -> {
            if (myEm.getLastName().length() > 4) return true;
            else return false;
        };
        Predicate<MyEmployee> predFirstName = (MyEmployee myEm) -> {
            if (myEm.getFirstName().length() < 8) return true;
            else return false;
        };
        Function<MyEmployee, String> function = MyEmployee::getLastName;
        Consumer<MyEmployee> consumer = (x)-> System.out.println(x.toString()+" I am here!");
        Supplier<Collection<MyEmployee>> supp= ()-> {return new ArrayList<MyEmployee>();};

        MyFilterIterator<MyEmployee> myIter = new MyFilterIterator<>(realIterator);
        MyFilterIterator<MyEmployee> myIter2 = new MyFilterIterator<>(realIterator);
        Collection buf = new ArrayList();
        buf = myIter.collect(supp);
        MyFilterIterator<MyEmployee> myIter3 = myIter.filter(predLastName).filter(predFirstName).map(function);


        System.out.println("Test 1");
        while(myIter3.hasNext()) {
            System.out.println(myIter3.next());
        }
        /*System.out.println("Test 2");
        myIter.forEach(consumer);*/

    }
}
