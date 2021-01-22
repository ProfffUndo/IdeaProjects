package mephi.Lab1.ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the deep of triangle");
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> triangle = createTriangle(n);
        outTriangle(triangle);
    }
    public static ArrayList<ArrayList<Integer>> createTriangle(int n){
        ArrayList<ArrayList<Integer>> tri = new ArrayList<>(n);
         //Каждый раз новый иначе все будут одинаковыми и большими, потому что ссылка
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>(i + 1);
            for (int k = 0; k < i + 1; k++) {
                line.add(0);
            }
            line.set(0, 1);
            line.set(i, 1);
            for (int j = 1; j < i; j++) {
                line.set(j, tri.get(i - 1).get(j - 1) + tri.get(i - 1).get(j));
            }
            //System.out.println(line);
            tri.add(line);
        }
        return tri;
    }
    public static void outTriangle(ArrayList<ArrayList<Integer>> tri){
        int max = tri.size() * 2 - 1;
        for (int i = 0; i < tri.size(); i++) {
            for (int k = 0; k < max - i; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < tri.get(i).size(); j++) {
                System.out.printf("%d\t\t", tri.get(i).get(j));
            }
            System.out.println();
        }
    }
}
//метод принт красиво вывести
// сразу в arraylist