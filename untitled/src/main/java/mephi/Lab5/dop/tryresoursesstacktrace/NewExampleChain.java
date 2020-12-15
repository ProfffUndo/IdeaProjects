package mephi.Lab5.dop.tryresoursesstacktrace;

import mephi.Lab4.Ex9.Ex9;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;


public class NewExampleChain{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double res;

        try {
            if (b==0){
                ArithmeticException ae = (ArithmeticException) new ArithmeticException("Деление на 0")
                        .initCause(new IOException("Некорректный ввод"));
                throw ae;
            }
            res=a/b;
            System.out.println(res);
        }
        catch (ArithmeticException ae) {
            System.out.println("Причина : " + ae);
            ae.printStackTrace();
            System.out.println("Реальная причина :" + ae.getCause());
        }
    }




}