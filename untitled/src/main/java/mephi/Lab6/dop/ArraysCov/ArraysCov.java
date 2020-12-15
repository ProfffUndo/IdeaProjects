package mephi.Lab6.dop.ArraysCov;

import mephi.Lab3.ex14.Employee;

public class ArraysCov {
    public static void main(String[] args) {
        Manager[] managers = {
                new Manager("first", 200d, 20),
                new Manager("second", 300d, 10),
        new Manager("third", 400d, 0)};

        increaseSalary(managers);

        for(int i=0; i<managers.length; i++){
            System.out.println(managers[i].toString());
        }


   /*     Manager[] bosses = new Manager[10];
    Employee[] empls = bosses;
    empls[0] = new Employee (...); // RunTime
*/


    }

    public static void increaseSalary(Employee[] staff) {
        for(int i=0; i<staff.length; i++){
            staff[i].setSalary(staff[i].getSalary()*2);
        }
    }
}
