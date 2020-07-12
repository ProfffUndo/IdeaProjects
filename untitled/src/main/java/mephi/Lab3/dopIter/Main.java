package mephi.Lab3.dopIter;

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

        MyIterator<MyEmployee> iter= MyIterator.fromIterator(testArr.iterator());

        MyIterator myrealIter;
        Predicate<MyEmployee> predLastName = (MyEmployee myEm) -> {
            if (myEm.getLastName().length() > 4) return true;
            else return false;
        };
        Predicate<MyEmployee> predFirstName = (MyEmployee myEm) -> {
            if (myEm.getFirstName().length() < 8) return true;
            else return false;
        };

       /* Consumer<MyEmployee> consumer = (x)-> System.out.println(x.toString()+" I am here!");
        System.out.println("Test Consumer");
        iter.forEach(consumer);*/

        /*Supplier<Collection<MyEmployee>> supp= ArrayList::new;
        Collection<MyEmployee> buf; //= new ArrayList<MyEmployee>();
        buf = iter.collect(supp);
        System.out.println(buf);*/

        Function<MyEmployee, String> function = MyEmployee::getLastName;
        myrealIter=iter.filter(predFirstName).filter(predLastName).map(function);
        while (myrealIter.hasNext()){
            System.out.println(myrealIter.next());
        }
    }
}

