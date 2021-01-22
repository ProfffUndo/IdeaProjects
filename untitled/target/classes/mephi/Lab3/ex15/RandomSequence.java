package mephi.Lab3.ex15;

import java.util.Random;

public class RandomSequence implements IntSequence {
    private int low;
    private int high;
    private Random generator;

    RandomSequence(int low, int high) {
        this.low = low;
        this.high = high;
        generator = new Random();
    }

    public int next() {
        return low + generator.nextInt(high - low + 1);
    }

    public boolean hasNext() {
        return true;
    }
}
