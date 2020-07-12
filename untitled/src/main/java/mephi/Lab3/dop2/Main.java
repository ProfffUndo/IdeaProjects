package mephi.Lab3.dop2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       String[] myStrings = {"Aidar", "Danila", "Dmitriy", "Nazar", "Alexander", "Kirill", "Mihail", "Ivan", "Vasilina"};
        /* MyEmployee[] employees ={new MyEmployee("Alexander","Koromyslov",400),
                new MyEmployee("Michael","Jordan",500),
                new MyEmployee("David","Beckham",600),
                new MyEmployee("Elton","John",700)};*/

        System.out.println("Before sort");
        for (int i=0; i<myStrings.length; i++) {
            System.out.print(myStrings[i] + "  ");
        }

        Comparator<String> comp = (String first, String second) -> {
            int dif = first.length() - second.length();
            if (dif < 0) return -1;
            else if (dif == 0) return 0;
            else return 1;   //можно заменить на приватный метод
        };

        Comparator<String> comp2 = comp.reversed();

        mySort(1, myStrings, comp);
        for (int i=0; i<myStrings.length; i++) {
            System.out.print(myStrings[i]+"  ");
        }
        mySort(1, myStrings, comp2);
        for (int i=0; i<myStrings.length; i++) {
            System.out.print(myStrings[i]+"  ");
        }
    }

    public static void mySort(int sortType, String[] myStrings, Comparator comp) {
        System.out.println();
        if (sortType == 1) {
            System.out.println("Bubblesort");
            for (int i = 0; i < myStrings.length; i++) { //bubblesort
                for (int j = myStrings.length - 1; j > i; j--) {
                    if (comp.compare(myStrings[j], myStrings[j - 1]) > 0) {
                        String temp = myStrings[j];
                        myStrings[j] = myStrings[j - 1];
                        myStrings[j - 1] = temp;
                    }
                }
            }
        }
        else if (sortType == 2) {
            System.out.println("Insertionsort");
            for (int i = 1; i < myStrings.length; i++) { //insertionsort
                String current = myStrings[i];
                int j = i - 1;
                while (j >= 0 && (comp.compare(current, myStrings[j])) == -1) { //current<array[j]
                    myStrings[j + 1] = myStrings[j];
                    j--;
                }
                myStrings[j + 1] = current;
            }
        } else if (sortType == 3) {
            System.out.println("Selectionsort");
            for (int i = 0; i < myStrings.length; i++) { //selectionsort
                String min = myStrings[i];
                int minId = i;
                for (int j = i + 1; j < myStrings.length; j++) {
                    if (comp.compare(myStrings[j], min) == -1) {  //array[j] < min
                        min = myStrings[j];
                        minId = j;
                    }
                }
                // замена
                String temp = myStrings[i];
                myStrings[i] = min;
                myStrings[minId] = temp;
            }
        }
            else{
                System.out.println("Incorrent number of type");
                return;
            }
        }
    }
