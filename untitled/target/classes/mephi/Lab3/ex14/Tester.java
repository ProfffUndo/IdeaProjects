package mephi.Lab3.ex14;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {
    public static void main(String[] args) {
        Comparator<Employee> comp1 = ((Comparator<Employee>) Comparator.comparing(Employee::getSalary)).thenComparing(Comparator.comparing(Employee::getName));
        Comparator<Employee> comp2 = ((Comparator<Employee>) Comparator.comparing(Employee::getSalary).reversed()).thenComparing((Comparator.comparing(Employee::getName)));
    }

}