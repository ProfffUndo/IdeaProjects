package mephi.Lab4.Ex12;

import java.util.Random;

public class GetRandomNumbers {
    int[] arr;

    public GetRandomNumbers() {
        arr = new int[100000000];
    }

    public void gettingRandomNumbers() {

        Random gen = new Random(System.currentTimeMillis());

        for (int i = 0; i < arr.length; i++) {

            arr[i] = gen.nextInt(arr.length);
        }
    }
}

