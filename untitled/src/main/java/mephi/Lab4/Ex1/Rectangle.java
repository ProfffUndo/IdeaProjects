package mephi.Lab4.Ex1;

public class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(){
        super();
       width=0;
       height=0;
    }

    Rectangle(Point topLeft, int width, int height){
        point=topLeft;
        this.width=width;
        this.height=height;
    }

    @Override
    public Point getCenter() {
        double xCenter=(point.getX()+point.getX()+width)/2;
        double yCenter=(point.getX()+point.getX()-height)/2;
        return new Point(xCenter,yCenter);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(point,width,height);
    }
}
