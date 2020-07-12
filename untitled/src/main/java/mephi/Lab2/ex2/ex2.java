package mephi.Lab2.ex2;

import java.util.Random;
import java.util.Scanner;

public class ex2 {
    Scanner in = new Scanner(System.in); //nextInt является модифицирующим, потому что изменяет состоянеие сканера после вызова nextInt
    /**
     * If rhe translation is successful, the scanner advances part the input that matched.
     * Меняет положение ввода => меняет состояние сканнера
     * mutator
     */

    int m = in.nextInt();
    Random r = new Random();
    int n = r.nextInt(); //r.NextInt использует, но не меняет состояние класса
}