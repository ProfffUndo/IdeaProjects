package mephi.Lab3.dop1.var1;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Shape> myShapes = new ArrayList<>();
        Shape myCircle = new Circle(2);
        Shape mySquare = new Square (5);
        Shape myCircle2 = new Circle (3);
        myShapes.add(myCircle);
        myShapes.add(mySquare);
        myShapes.add(myCircle2);
        System.out.println(sumOfAreas(myShapes));

    }
    public static double sumOfAreas(ArrayList<Shape> testShapes){
        int sum=0;
        for (int i = 0; i<testShapes.size(); i++){
            sum+=testShapes.get(i).getArea();
        }
        return sum;
    }
}
