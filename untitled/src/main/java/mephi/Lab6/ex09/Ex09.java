package mephi.Lab6.ex09;

import mephi.Lab6.ex07.Pair;

import java.util.ArrayList;

public class Ex09 {
    public static <E> Pair<E> firstLast(ArrayList<E> arr) throws Exception {

        if(arr.size() == 0)
            throw new Exception("The array is empty");

        else{
            Pair pair = new Pair<E>(arr.get(0), arr.get(arr.size()-1));
            return pair;
        }
    }
}
