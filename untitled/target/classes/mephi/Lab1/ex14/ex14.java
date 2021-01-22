package mephi.Lab1.ex14;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your numbers");          //Ввод данных в ЭррэйЛист  // 4 9 2 3 5 7 8 1 6
        ArrayList<Integer> array= new ArrayList<>() ;
        int k = 1;
        while(k==1){
            String buf = in.nextLine();
            if (buf.equals("")){
                k=0;
            }
            else {
                array.add(Integer.parseInt(buf));
            }
        }
        System.out.println("You entered those values");
        System.out.println(array.toString());
        boolean isItSquare = false;                    //Проверка на квадратность
        double lenSquare = sqrt(array.size());
        myLabel: if (lenSquare%1!=0)
            System.out.println("It is not a square!"); //Ввод квадрата
            else {
            int m = (int) lenSquare;
            int[][] square = new int[m][m];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        square[i][j] = array.get(m*i + j);
                    }
                }
            System.out.println("Your square");        //Вывод квадрата
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(square[i][j]);
                    }
                    System.out.println();
                }
            boolean isItMagic = false;
            int magicValue = 0;
            int contender = 0;
                for (int j = 0; j < m; j++) {   //Высчитываем магическое число
                    magicValue+=square[0][j];
                }
                for (int i = 1; i < m; i++) { //Проверка строк
                    contender = 0;
                    for (int j = 0; j < m; j++) {
                        contender+=square[i][j];
                    }
                    if (contender != magicValue) {
                        System.out.println("There are no magic here!");
                        break myLabel;
                    }
                }
                for (int j = 0; j < m; j++) { //Проверка столбцов
                    contender = 0;
                    for (int i = 0; i < m; i++) {
                        contender+=square[i][j];
                    }
                    if (contender != magicValue) {
                        System.out.println("There are no magic here!");
                        break myLabel;
                    }
                }
                contender = 0;
                for (int q = 0; q < m; q++) { //Проверка диагонали 1
                        contender+=square[q][q];
                    }
                    if (contender != magicValue) {
                        System.out.println("There are no magic here!");
                        break myLabel;
                    }
                contender = 0;
                for (int w = 0; w < m; w++) { //Проверка диагонали 2
                    contender+=square[w][m-w-1];
                }
                if (contender != magicValue) {
                    System.out.println("There are no magic here!");
                    break myLabel;
                }
                System.out.println("It`s a kind of magic!");
                }

    }
}
