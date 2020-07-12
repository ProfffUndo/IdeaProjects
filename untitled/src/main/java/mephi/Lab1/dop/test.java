package mephi.Lab1.dop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        double[] numbers = {10.2,56.0,54.7};
        Arrays.stream(numbers).map(n->n+1).toArray();
        System.out.println(Arrays.toString(numbers));
    }
    public static void update (String string, String suffix){
        string+=" "+suffix;
    }
}

