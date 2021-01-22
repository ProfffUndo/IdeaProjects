package mephi.Lab1.ex04;
import static java.lang.Math.nextUp;
import static java.lang.Math.nextDown;

public class ex04 {
    public static void main(String[] args) {
        double min=Math.nextUp(0);
        double max=Double.MAX_VALUE;
        String ans1 = Double.toString(min);
        String ans2 = Double.toString(max);
        System.out.println("Minimum of double+");
        System.out.println(ans1);
        System.out.println("Maximum of double+");
        System.out.println(ans2);
    }
}
