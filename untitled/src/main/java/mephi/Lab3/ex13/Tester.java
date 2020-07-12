package mephi.Lab3.ex13;

public class Tester {
    public static void main(String[] args) {
        Runnable run1 = () -> {
            System.out.println("Hello");
        };
        Runnable run2 = () -> {
            System.out.println("World!");
        };

        Runnable [] mas = {run1,run2};

        final Runnable totalrun = totalrun(mas);

        totalrun.run();
    }
    public static Runnable totalrun (Runnable[] first){

        return () -> {
            for (int i=0; i<first.length; i++){
                first[i].run();
            }
        };
    }
}