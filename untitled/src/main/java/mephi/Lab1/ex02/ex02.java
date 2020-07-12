package mephi.Lab1.ex02;

import java.util.Scanner;
import java.lang.Integer;

import static java.lang.Math.floorMod;
import static java.lang.Math.abs;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the angle");
        int angle = in.nextInt();
        int realAngle1;
        if (angle < 0) {
            realAngle1 = 360 - abs(angle % 360);
        }
        else{
            realAngle1 = abs(angle % 360);
        }
        String outAngle1 = Integer.toString(realAngle1);
        int realAngle2 = floorMod(angle, 360);
        String outAngle2 = Integer.toString(realAngle2);
        System.out.println("This is a result of %");
        System.out.println(outAngle1);
        System.out.println("This is a result of floorMod");
        System.out.println(outAngle2);
    }
}

//Если признаки аргументов одинаковы, результаты floorMod и оператора % совпадают, иначе реультаты различны