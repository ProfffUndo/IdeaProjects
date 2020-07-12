package mephi.Lab1.ex16;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please number of values");
        int n = in.nextInt();
        int[] values = new int [n];
        System.out.println("Please enter your values");
            for (int i = 0; i < n; i++) {
                values[i] = in.nextInt();
            }
        int one = values[0];
        System.out.println(average(one,values));
    }
    public static double average(int one, int[] values) {
        double sum = 0;
        sum = one;
        for (int i = 1; i < values.length; i++) {
            sum += values[i];
        }
      //  return values.length == 0 ? 0 : sum / values.length;
        return sum/values.length;
    }
}
