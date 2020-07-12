package mephi.Lab1.ex03;

import java.util.Scanner;
import java.lang.Integer;

import static java.lang.Math.max;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        if ((number1 >= number2) && (number1 >= number3)){
            String answer1= Integer.toString(number1);
            System.out.println("Maximum with if");
            System.out.println(answer1);
        }
        else if (number2 >= number3){
            String answer1 = Integer.toString(number2);
            System.out.println("Maximum with if");
            System.out.println(answer1);
        }
        else{
            String answer1 = Integer.toString(number3);
            System.out.println("Maximum with if");
            System.out.println(answer1);
        }


        if (Math.max(number1,number2) == (Math.max(number1,number3))){
            String answer2= Integer.toString(number1);
            System.out.println("Maximum with Math.max");
            System.out.println(answer2);
        }
        else{
            String answer2 = Integer.toString(Math.max(number2,number3));
            System.out.println("Maximum with Math.max");
            System.out.println(answer2);
        }
    }
}

//Был выбор либо объявить переменную для всех вне циклов, либо инициализировать ее внутри циклов и там же выводить, так было бы даже лучше наверное
/*
String answer1;
String answer2;
if ((number1 >= number2) && (number1 >= number3)){
            String answer1= Integer.toString(number1);
        }
        else if (number2 >= number3){
            String answer1 = Integer.toString(number2);
        }
        else{
            String answer1 = Integer.toString(number3);
        }


        if (Math.max(number1,number2) == (Math.max(number1,number3))){
            String answer2= Integer.toString(number1);
        }
        else{
            String answer2 = Integer.toString(Math.max(number2,number3));
        }
         System.out.println("Maximum with if");
         System.out.println(answer1);
         System.out.println("Maximum with Math.max");
         System.out.println(answer2);
 */