package mephi.Lab2.ex6;

public class ex6 {
    public static void main(String[] args) {
        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
