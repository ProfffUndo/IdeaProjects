package mephi.Lab3.ex15;
import java.util.Random;

public class Sequence {
    public static void main(String[] args) {
        System.out.println(randomInts(1, 6).toString());
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}