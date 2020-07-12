package mephi.Lab1.ex07;

import java.util.Scanner;

import static java.lang.Math.floorMod;

public class ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers between 0 and 65535");
        short num1 = (short) in.nextInt();
        short num2 = (short) in.nextInt();
       // short add = (short) (num1 + num2); // После перевала за наибольшее, пошло дальше начиная с минимального для short
       // short sub = (short) (num1 - num2);
       // short mul = (short) (num1 * num2); // Умножение также
       // short div = (short) (num1 / num2);
       // short mod = (short) (floorMod(num1, num2));
        System.out.println("Addition");
        System.out.println(add(num1,num2));
        System.out.println("Substraction");
        System.out.println(sub(num1,num2));
        System.out.println("Multiply");
        System.out.println(mul(num1,num2));
        System.out.println("Division");
        System.out.println(div(num1,num2));
        System.out.println("Remainder of division");
        System.out.println(mod(num1,num2));
    }

    public static int add(short a, short b) {
        if ((a >= 0) && (b >= 0)) {
            return a + b;
        } else if ((a < 0) && (b < 0)) {
            return a + b + 65536 + 65536;
        } else {
            return a + b + 65536;
        }
    }

    public static int sub(short a, short b) {
        if (((a >= 0) && (b >= 0)) || ((a < 0) && (b < 0))) {
            return a - b;
        } else if (a < 0) {
            return a - b + 65536;
        } else {
            return a - b - 65536;
        }
    }

    public static int mul(short a, short b) {
        if ((a >= 0) && (b >= 0)) {
            return a * b;
        } else if ((a < 0) && (b < 0)) {
            return (a + 65536) * (b + 65536);
        } else if (a < 0) {
            return (a + 65536) * b;
        } else {
            return a * (b + 65536);
        }
    }

    public static double div(short a, short b) {
        if ((a >= 0) && (b >= 0)) {
            return a/b;
        }
        else if ((a < 0) && (b < 0)) {
            return (a + 65536)/(b + 65536);
        } else if (a < 0) {
            return (a + 65536)/b;
        } else {
            return a/(b + 65536);
        }
    }

    public static double mod(short a, short b) {
        if ((a >= 0) && (b >= 0)) {
            return a%b;
        }
        else if ((a < 0) && (b < 0)) {
            return (a + 65536)%(b + 65536);
        } else if (a < 0) {
            return (a + 65536)%b;
        } else
            return a%(b + 65536);
        }
}
