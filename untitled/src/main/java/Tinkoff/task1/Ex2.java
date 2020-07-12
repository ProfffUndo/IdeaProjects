package Tinkoff.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().trim();
        String[] array = line.replace(" -", "").split(" +");
        int number = 0;
        if (line.length() != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("-")) {
                    number++;
                }
            }
            System.out.println(array.length - number);
        }
        else
            System.out.println(0);
    }


}
