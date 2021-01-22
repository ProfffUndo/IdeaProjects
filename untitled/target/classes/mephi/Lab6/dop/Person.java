package mephi.Lab6.dop;

import mephi.Lab3.ex14.Employee;

public class Person {
    private String name;

    public Person() {

    }

    public String getName(){ return name; }

    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}

