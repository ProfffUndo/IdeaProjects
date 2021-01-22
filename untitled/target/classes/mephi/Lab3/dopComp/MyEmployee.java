package mephi.Lab3.dopComp;

import mephi.Lab3.ex1.Measurable;

public class MyEmployee implements Measurable {
    private double salary;
    String firstName;
    String lastName;

    public MyEmployee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double newSalary){
        salary=newSalary;
    }

    public double getMeasure(){
        return salary;
    }

    @Override
    public String toString() {
        String res = lastName + "\t" + firstName +"\t" + salary;
        return  res;
    }
}
