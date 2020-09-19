package mephi.Lab5.ex10;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Stack;

public class Ex10 {
    public static void main(String[] args) {
        factorial(5);
    }

    public static void bad() {
        System.out.println(1 / 0);
    }

    public static long factorial(int num) {

        try {
            bad();
        } catch (IllegalArgumentException ex) {
            StackTraceElement[] frames = ex.getStackTrace();
            for (StackTraceElement frame : frames)
                System.out.println("Frame: " + frame);
        } catch (ArithmeticException ex) {
            StackTraceElement[] frames = ex.getStackTrace();
            for (StackTraceElement frame : frames)
                System.out.println("Frame: " + frame);
        }
        return num;
    }
}