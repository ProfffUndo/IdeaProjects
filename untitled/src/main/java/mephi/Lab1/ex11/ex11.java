package mephi.Lab1.ex11;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String myStr = in.nextLine();
        System.out.println("non-Ascii symobls:");
        for (int i = 0; i < myStr.length(); i++) {
            char ch = myStr.charAt(i);
            if ((int) ch > 128) {
                System.out.print((int)ch);
                System.out.print("\t");
                System.out.println(ch);
            }
        }
    }
}

//ĢŜǅɰ