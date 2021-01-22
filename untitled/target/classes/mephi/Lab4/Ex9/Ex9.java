package mephi.Lab4.Ex9;

import mephi.Lab4.Ex1.LabeledPoint;
import mephi.Lab4.Ex1.Point;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static class A{
        int x;
        double y;
        String str;

        public A() {
            x=0;
            y=0;
            str="Empty";
        }

        public A(int x, double y, String str) {
            this.x = x;
            this.y = y;
            this.str = str;
        }

    }

    public static class B extends A{

        Point p;
        Scanner scn;
        ArrayList<LabeledPoint> label;

        public B(int a,double b, String c, Point p, Scanner s, ArrayList<LabeledPoint> l ) {
            super(a,b,c);
            this.p=p;
            this.scn=s;
            this.label=l;
        }

        public B() {
            this.p = new Point();
            this.scn = new Scanner(System.in);
            this.label = new ArrayList<>();
        }


    }

    public static void main(String[] args) {

        B b = new B(2,5.6,"dwf",new Point(), new Scanner(System.in), new ArrayList<>());
        System.out.println(getFields(b));
    }

    public static String getFields(Object obj) {

        StringBuilder builder = new StringBuilder();

        Class<?> cl = obj.getClass();

        builder.append("Class: "+obj.getClass().getSimpleName()+"\nFields: \n");

        while(cl != null) {

            for (Field f : (obj.getClass().getFields())) {

                f.setAccessible(true);
                builder.append(f.getName());
                Class o=(f.getType());

                /*if(o.isArray())
                    builder.append(o/*.arrayType().getTypeName());*/

                builder.append(f.getType()+" ")	;

            }

            cl = cl.getSuperclass();
        }
        return builder.toString();
    }

}
