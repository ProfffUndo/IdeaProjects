package mephi.Lab1.ex08;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String myStr = in.nextLine();
        //System.out.println(myStr.substring(1,5));
        for (int i = 0; i <= (myStr.length() - 1); i++) {
            for (int j = i + 1; j <= (myStr.length()); j++) {
                System.out.println(myStr.substring(i, j));
            }
        }
    }
}
