package Tinkoff.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex3 {
    public static void main(String[] args) throws IOException {
       int xMin = 0;
       int xMax = 0;
       int yMin = 0;
       int yMax = 0;
       int a;
       int b;
       int c;
       int d;
       double perimetr =0;
        //double y1;
        //double y2;
       // double y3;
       // double y4;

        Scanner in =new Scanner(System.in);
        int number = in.nextInt();
        int[] arX = new int[number];
        int[] arY = new int[number];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<number; i++){
            String myline=br.readLine();
            String[] lineArray=myline.split(" ");
            arX[i] = Integer.parseInt(lineArray[0]);
            arY[i] = Integer.parseInt(lineArray[1]);
        }

        xMin=arX[0];
        xMax=arX[0];
        yMin=arY[0];
        yMax=arX[0];

        a=arX[0]+arY[0]+1;
        b=arY[0]-arX[0]+1;
        c=arX[0]+arY[0]-1;
        d=arY[0]-arX[0]-1;

        for (int i=1; i<number; i++) {
            if (arX[i]>xMax){
                xMax=arX[i];
            }
            if (arX[i]<xMin){
                xMin=arX[i];
            }
            if (arY[i]>yMax){
                yMax=arY[i];
            }
            if (arY[i]<yMin){
                yMin=arY[i];
            }

            if (arX[i]+arY[i]+1 > a){
                a = arX[i]+arY[i]+1;
            }
            if (arY[i]-arX[i]+1 > b){
                b = arY[i]-arX[i]+1;
            }
            if (arX[i]+arY[i]-1 < c){
                c = arX[i]+arY[i]-1;
            }
            if (arY[i]-arX[i]-1 < d){
                d = arY[i]-arX[i]-1;
            }
        }

        int x1 = xMax+1;
        int y1 = -x1+a;
        int y2 = yMax+1;
        int x2 = a-y2;
        int y3 = yMax+1;
        int x3 = y3-b;
        int x4 = xMin-1;
        int y4 = x4 + b;
        int x5 = xMin-1;
        int y5 = -x5+c;
        int y6 = yMin-1;
        int x6 = c-y6;
        int y7 = yMin-1;
        int x7 = y7-d;
        int x8 = xMax+1;
        int y8 = x8+d;

        perimetr=(sqrt(2)*((x1-x2)+(x3-x4)+(x6-x5)+(x8-x7)))+((x2-x3)+(x7-x6)+(y1-y8)+(y4-y5));
        System.out.println(perimetr);
    }

}