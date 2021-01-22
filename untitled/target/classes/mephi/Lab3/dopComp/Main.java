package mephi.Lab3.dopComp;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       MyEmployee[] employees ={new MyEmployee("Alexander","Koromyslov",400),
               new MyEmployee("Michael","Jordan",500),
               null,
               new MyEmployee("David","Beckham",600),
               null,
               new MyEmployee("Elton","John",700),
       };

      /*  MyComparator<String> comp = (String first, String second) -> {
            int dif = first.length() - second.length();
            if (dif < 0) return -1;
            else if (dif == 0) return 0;
            else return 1;
        };*/


        //sort(employees,MyComparator.comparing(MyEmployee::getLastName,comp));
        //sort(employees,MyComparator.comparing(MyEmployee::getLastName).reversed());
        sort(employees,MyComparator.comparing(MyEmployee::getLastName).thenComparing(MyEmployee::getFirstName).nullsFirst());
        //sort(employees,MyComparator.comparing(MyEmployee::getFirstName,(s, t)->s.length() - t.length()));
        for (int i=0; i<employees.length; i++) {
            System.out.println(employees[i]);
            /*if (employees[i]==null) {
                System.out.println("NULL");
            }
            else{
                System.out.println(employees[i].toString());
            }*/
        }
    }


    public static void sort(MyEmployee[]employees,MyComparator myComparator){
        boolean hasNextIter = true;
        while (hasNextIter) {
            hasNextIter = false;
            for (int i = 1; i < employees.length; i++)
                if (myComparator.compare(employees[i],employees[i-1])<0) {
                    MyEmployee p= employees[i];
                    employees[i] = employees[i-1];
                    employees[i-1] = p;
                    hasNextIter = true;
                }
        }
    }
}
