package mephi.Lab2.ex10;

import java.util.ArrayList;

public class ex10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] clear = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(RandomNumbers.randomElement(array)); // 1 2 3
        System.out.println(RandomNumbers.randomElement(list)); // 4 5 6
        System.out.println(RandomNumbers.randomElement(clear)); // 0
    }
}
