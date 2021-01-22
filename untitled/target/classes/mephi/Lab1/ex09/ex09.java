package mephi.Lab1.ex09;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int res = str1.compareTo(str2);
        if (res == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
