package mephi.Lab2.ex3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        ArrayList<Integer> a= new ArrayList<>();
        a.add(3);
        a.add(4);
        String b = "Hello";
        Ex3 example = new Ex3(a,b);
        int sizeof = 0;
        String c = "Max";
        example.get(c);
        System.out.println(c);

    }
}
