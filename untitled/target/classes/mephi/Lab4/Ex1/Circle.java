package mephi.Lab4.Ex1;

public class Circle extends Shape {
    double radius;

    public Circle(){
        super();
        radius = 0;
    }
    Circle(double r){
        super();
        radius = r;
    }
    Circle(Point point, double r){
        this.point=point;
        radius = r;
    }


    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return new Circle(point,radius);
    }
}