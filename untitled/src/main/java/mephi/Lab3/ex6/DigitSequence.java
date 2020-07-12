package mephi.Lab3.ex6;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int number;

    public DigitSequence(int n){
        number =n;
    }
    @Override
    public boolean hasNext() {
        return number!=0;
    }

    @Override
    public Integer next() {
        int result = number %10;
        number/=10;
        return result;
    }

    public int rest(){
        return number;
    }

    public void printSequnce(){
            System.out.println(next());
    }

    @Override
    public void remove() {

    }
}
