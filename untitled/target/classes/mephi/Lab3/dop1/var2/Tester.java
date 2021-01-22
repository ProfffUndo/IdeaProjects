package mephi.Lab3.dop1.var2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
         Circle2 myCircle = new Circle2(2);
         Square2 mySquare = new Square2(5);
         double sum = 0;
        List<Circle2> list1 = Arrays.asList(myCircle);
        List<Square2> list2 = Arrays.asList(mySquare);
         sum = myCircle.getArea()+mySquare.getArea();
        System.out.println(sum);
        circlesSquare(list1);
    }

    public static double circlesSquare (List<Circle2> circles){
        double sum=0;
        for (int i=0; i<circles.size(); i++){
            sum+=circles.get(i).getArea();
        }
        return sum;
    }

    public static double squaresSquare (List<Square2> squares){
        double sum=0;
        for (int i=0; i<squares.size(); i++){
            sum+=squares.get(i).getArea();
        }
        return sum;
    }
}
