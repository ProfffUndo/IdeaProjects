package mephi.Lab3.dop1.var1;

public class Square implements Shape {
    int a;

    Square(int a){
        this.a=a;
    }
    public double getArea() {
        return a*a ;
    }
}
