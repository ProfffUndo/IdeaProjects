package mephi.Lab1.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ex13 {
    public static void main(String[] args) {
        ArrayList <Integer> lottery = new ArrayList<>() ;
        Random r = new Random();
       // ArrayList <Integer> answers = new ArrayList<>() ;
        int[] answers = {0,0,0,0,0,0};
        answers = new int[6];

        for (int i = 1; i <=49 ; i++) { //Заполнение массива
            lottery.add(i);
        }
        for (int j = 0; j < 6; j++){ //Проведение лотереи
            int val = r.nextInt(48-j);
            answers[j]=lottery.get(val);
            lottery.remove(val);
        }
        System.out.println("New List");
        String ourList = lottery.toString();
        System.out.println(ourList);

        Arrays.sort(answers);
        System.out.println("Results of lottery");
        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i]);
            System.out.print("\t");
        }
    }
}
