package Tinkoff.task1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int brigade = in.nextInt();
        int arLength = in.nextInt();
        int[] cabinetes = new int[arLength];
        for (int i=0; i<arLength; i++){
            cabinetes[i]=in.nextInt();
        }
        int counter = 0;
        for (int pointer=0;pointer<cabinetes.length;pointer++){
            if(cabinetes[pointer]==1){
                counter++;
                pointer=pointer+brigade-1;
            }
            else if(cabinetes[pointer]==0){
            }
            else{
                System.out.println("ERROR");
                break;
            }
        }
        System.out.println(counter);
    }
}
