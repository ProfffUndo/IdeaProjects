package mephi.Lab6.ex17;

import mephi.Lab3.ex14.Employee;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.round;

public class Ex17 {
    public static class ComparableEmployee
            extends Employee implements Comparable<Employee> {

        public ComparableEmployee(String name, double salary) {
            super(name, salary);
        }

        @Override
        public int compareTo(Employee e) {
            return ((int) round(this.getSalary() - e.getSalary()));
        }

    }

    public static void main(String[] args) {

        ComparableEmployee e1 = new ComparableEmployee("joe", 1.);
        ComparableEmployee e2 = new ComparableEmployee("jane", 2.);
        ComparableEmployee e3 = new ComparableEmployee("polly", 3.);
        ArrayList<ComparableEmployee> ale = new ArrayList<>();
        ale.add(e3); ale.add(e1); ale.add(e2);
        System.out.println(ale);

        Collections.sort(ale);
        System.out.println(ale);

    }
}
