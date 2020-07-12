package Yandex;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 10000) {
            int[] array = new int[n];
            int counter = 0;
            int buf = 0;
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
                if (array[i] == 1) {
                    buf++;
                    if (buf > counter) {
                        counter = buf;
                    }
                } else {
                    buf = 0;
                }
            }
            System.out.println(counter);
        }
    }
}
