package mephi.Lab1.ex06;

import java.math.BigInteger;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of factorial");
        int n = in.nextInt();
        BigInteger res=BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        String answer = res.toString();
        System.out.println("The answer is");
        System.out.println(answer);

    }
}

