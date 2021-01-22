package mephi.Lab4.Ex11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Class<?> cl = Class.forName("java.lang.System");  //Добираемся до класса

        Field f = cl.getField("out"); //Добираемся до поля

        Class<?> clf = f.getType(); //Получаем типа поля

        Method m = clf.getMethod("println", String.class); //Получаем нужный метод

        m.invoke(f.get(null), "Hello World!"); //Запускаем метод через инвоук
    }
}
