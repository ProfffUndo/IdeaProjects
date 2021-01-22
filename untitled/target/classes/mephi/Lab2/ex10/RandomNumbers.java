package mephi.Lab2.ex10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
   /* private static int[] randomArray;
    private static ArrayList<Integer> randomList;

    public RandomNumbers() {
        randomArray = null;
        randomList = null;
    }

    public RandomNumbers(int[] array) {
        this.randomArray = array;
        randomList = null;
    }

    public RandomNumbers(ArrayList<Integer> list) {
        randomArray = null;
        this.randomList = list;
    }

    public RandomNumbers(int[] array, ArrayList<Integer> list) {
        this.randomArray = array;
        this.randomList = list;
    }

    public int[] getRandomArray() {
        return randomArray;
    }

    public ArrayList<Integer> getRandomList() {
        return randomList;
    }
*/

    public static int randomElement(int [] array) {
        int holyValue = 0;
            if (array.length != 0) {
                int r = new Random().nextInt(array.length);
                holyValue = array[r];
            }
            return holyValue;
        }
    public static int randomElement(ArrayList<Integer> list) {
        int holyValue = 0;
            if (list.size() != 0) {
                int r = new Random().nextInt(list.size());
                holyValue = list.get(r);
            }
        return holyValue;
    }
}

