package mephi.Lab6.dop.ArraysCov;

import mephi.Lab3.ex14.Employee;

public class Manager extends Employee {
    public Manager(String name, Double salary, double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }
 public Manager (){
        super();
        this.bonus=0;
 }
    double bonus;

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
