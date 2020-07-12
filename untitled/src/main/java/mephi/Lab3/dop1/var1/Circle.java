package mephi.Lab3.dop1.var1;

public class Circle implements Shape {

    int r;
    Circle(int r){
        this.r=r;
    }
    @Override
    public double getArea() {
        return Math.PI*r*r ;
    }
}
