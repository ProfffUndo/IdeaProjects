package mephi.Lab6.dop.presentation.task2;

import mephi.Lab6.ex01.Stack;

import java.util.ArrayList;
import java.util.List;

public class ProblemsWithoutGenerics {
    public static void main(String []args){
      //  example1();
        example2();
    }
    public static void example1(){
        List list = new ArrayList();
        list.add("Hello");
        String text = (String) list.get(0);
        System.out.print(text);
    }
    public static void example2(){
        List<String> list = new ArrayList();
        list.add("Hello!");
       // list.add(123);
        for (Object str : list) {
            System.out.println((String)str);
        }
    }
    public static void example3(){
        String string1= "123";
        String string2= "456";
        String string3= "789";

        Stack<String> stack = new Stack<>();
        StackWithoutGenerics stackWithoutGenerics = new StackWithoutGenerics();

        stack.push(string1);
        stack.push(string2);
        stack.push(string3);

        stackWithoutGenerics.push(string1);
        stackWithoutGenerics.push(string2);
        stackWithoutGenerics.push(string3);

        String result1 = stack.pop();

        String result2 = (String) stackWithoutGenerics.pop();

    }
}
