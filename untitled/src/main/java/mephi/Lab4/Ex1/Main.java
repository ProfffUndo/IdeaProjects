package mephi.Lab4.Ex1;

public class Main {
    public static void main(String[] args) {
        LabeledPoint point = new LabeledPoint("First",1,2);
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.toString());
        System.out.println(point.hashCode());

        LabeledPoint point2 = new LabeledPoint("First",10,3);
        System.out.println(point.equals(point2));
        System.out.println(point2.hashCode());

        LabeledPoint point3 = new LabeledPoint("First",1,2);
        System.out.println(point.equals(point3));
    }
}
