package mephi.Lab1.ex05;

public class ex05 {
    public static void main(String[] args) {
        double moreThanInt = Double.MAX_VALUE;
        int attempt = (int) moreThanInt;
        String answer = Integer.toString(attempt);
        String realValue = Double.toString(moreThanInt);
        System.out.println("Result of int");
        System.out.println(answer); //Приводится к максимальному значению int
        System.out.println("Real Value");
        System.out.println(realValue);
    }
}
