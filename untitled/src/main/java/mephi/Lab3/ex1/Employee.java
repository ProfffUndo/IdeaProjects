package mephi.Lab3.ex1;

public class Employee implements Measurable {
    private double salary;

    Employee (double newSalary){
     this.salary=newSalary;
    }

    public void setSalary(double newSalary){
        salary=newSalary;
    }

    public double getMeasure(){
        return salary;
    }



}
