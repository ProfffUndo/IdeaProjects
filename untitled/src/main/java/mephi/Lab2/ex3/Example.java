package mephi.Lab2.ex3;

import java.util.ArrayList;

public class Example {
    private static class Wrapper {
        private static int field;

        private static void fill(ArrayList wrapper) {
            wrapper.add(field);
        }
        public Wrapper (int field){
            this.field=field;
        }
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper(7);
        ArrayList ar = new ArrayList<Integer>();
        ar.add(6);
        wrapper.fill(ar);
        System.out.println((ar.get(0)));
        System.out.println((ar.get(1)));
    }


}