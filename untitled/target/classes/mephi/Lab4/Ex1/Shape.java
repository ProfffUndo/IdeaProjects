package mephi.Lab4.Ex1;

public abstract class Shape {
    Point point;

    Shape(){
        point = new Point();
    }

    public void moveBy(double dx, double dy){
        point.setX(point.getX()+dx);
        point.setY(point.getY()+dy);
    }

    abstract public Point getCenter();

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return new Shape() {
            @Override
            public Point getCenter() {
                return point;
            }
        };
    }
}
