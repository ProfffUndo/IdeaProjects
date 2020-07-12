package mephi.Lab4.Ex1;

import java.util.Objects;

public class Point {
    protected double x;
    protected double y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        if (point.getX()==this.getX() && point.getY()==this.getY()) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return (int) ((x+y)/10);
    }
}
