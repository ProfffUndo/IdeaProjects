package mephi.Lab4.Ex1;

public class Line extends Shape {
    Point to;

    Line (){
        super();
        to=new Point();
    }

    Line (Point from, Point to){
        point=from;
        this.to=to;
    }

    @Override
    public Point getCenter() {
        double xCenter = (point.getX()+to.getX())/2;
        double yCenter = (point.getY()+to.getY())/2;
        return new Point(xCenter,yCenter);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return new Line (point,to);
    }
}
