package mephi.Lab5.Books;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Throwable {
        BookStorage bookStorage=new BookStorage();

        Shelf shelf1 = new Shelf(1);
        Shelf shelf2 = new Shelf(2);
        Shelf shelf3 = new Shelf(3);
        Shelf shelf4 = new Shelf(4);

        bookStorage.add(shelf1);
        bookStorage.add(shelf2);
        bookStorage.add(shelf3);

        Book book11=new Book(1,"Автобиография Александра Невского","Невский");
        Book book12=new Book(2,"Принципы коммунизма","Маркс");
        Book book13=new Book(3,"Лабораторные работы по Prolog","Малышев");
        Book book21=new Book(4,"Красная шапочка","Перро");
        Book book22=new Book(5,"Занимательная теория относительности для самых маленьких","Эйнштейн");
        Book book31=new Book(6,"100 рецептов от Андрея Малахова","Малахов");


        Book book14=new Book(7,"50 оттенков Java","Джавтерсон");
        Book book15=new Book(8,"Атлас Улан-Удэ","Ермак");
        Book book24=new Book(9,"Лучшие карточные игры","Казинов");
        Book book41=new Book(10,"Топ лучших микроволновых печей","Печкин");



        ArrayList<Map.Entry<Book,Shelf>> arrayList=new ArrayList<>();
        Map.Entry<Book,Shelf> pair1=new AbstractMap.SimpleEntry<>(book14,shelf1);
        Map.Entry<Book,Shelf> pair2=new AbstractMap.SimpleEntry<>(book15,shelf1);
        Map.Entry<Book,Shelf> pair3=new AbstractMap.SimpleEntry<>(book24,shelf2);
        Map.Entry<Book,Shelf> pair4=new AbstractMap.SimpleEntry<>(book41,shelf4);


        bookStorage.add(book11,shelf1);
        bookStorage.add(book12,shelf1);
        bookStorage.add(book13,shelf1);
        bookStorage.add(book21,shelf2);
        bookStorage.add(book22,shelf2);
        bookStorage.add(book31,shelf3);


        arrayList.add(pair1);
        arrayList.add(pair2);
        arrayList.add(pair3);
        arrayList.add(pair4);

        bookStorage.transaction(arrayList);


        System.out.println(bookStorage);

    }
}