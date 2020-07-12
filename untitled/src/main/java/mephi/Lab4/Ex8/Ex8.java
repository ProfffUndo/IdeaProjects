package mephi.Lab4.Ex8;

import mephi.Lab4.Ex1.Circle;
import mephi.Lab4.Ex1.Point;
import mephi.OS.Client;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws ClassNotFoundException {

        ArrayList array = new ArrayList();
        array.add(new Point());
        Class<?> obj = array.getClass();

        System.out.println("\nОбобщенный тип");
        System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
        System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
        System.out.println("getTypeName() returns: "+ obj.getTypeName() );
        System.out.println("getName() returns: "+ obj.getName());
        System.out.println("toString() returns: "+ obj.toString());
        System.out.println("toGenericString() returns: "+ obj.toGenericString());


        //Приметивный тип
        obj = double.class;

        System.out.println("\n Приметивный тип");
        System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
        System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
        System.out.println("getTypeName() returns: "+ obj.getTypeName() );
        System.out.println("getName() returns: "+ obj.getName());
        System.out.println("toString() returns: "+ obj.toString());
        System.out.println("toGenericString() returns: "+ obj.toGenericString());

        //Массив
        obj = double[].class;

        System.out.println("\n Массив");
        System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
        System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
        System.out.println("getTypeName() returns: "+ obj.getTypeName() );
        System.out.println("getName() returns: "+ obj.getName());
        System.out.println("toString() returns: "+ obj.toString());
        System.out.println("toGenericString() returns: "+ obj.toGenericString());

        obj = String[].class;

        System.out.println("\n Массив");
        System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
        System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
        System.out.println("getTypeName() returns: "+ obj.getTypeName() );
        System.out.println("getName() returns: "+ obj.getName());
        System.out.println("toString() returns: "+ obj.toString());
        System.out.println("toGenericString() returns: "+ obj.toGenericString());


        //Внутренний класс
        Circle circle = new Circle();
        Point point = new Point();

        obj = point.getClass();

        System.out.println("\n Внутренний класс");
        System.out.println("\ngetCanonicalName() returns: "+obj.getCanonicalName());
        System.out.println("getSimpleName() returns: "+ obj.getSimpleName());
        System.out.println("getTypeName() returns: "+ obj.getTypeName() );
        System.out.println("getName() returns: "+ obj.getName());
        System.out.println("toString() returns: "+ obj.toString());
        System.out.println("toGenericString() returns: "+ obj.toGenericString());
    }
}
