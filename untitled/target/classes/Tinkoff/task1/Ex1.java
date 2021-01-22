package Tinkoff.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myline = br.readLine();
        String[] lineArray = myline.split(" ");
        int a = Integer.parseInt(lineArray[0]);
        int b = Integer.parseInt(lineArray[1]);
        int c = Integer.parseInt(lineArray[2]);
        int d = Integer.parseInt(lineArray[3]);
            if ((a * b) > (c * d)) {
                System.out.println('M');
            } else if ((a * b) < (c * d))
                System.out.println('P');
            else {
                System.out.println('E');
            }
        }
    }
