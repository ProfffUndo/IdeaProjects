package mephi.Lab2.ex3;

import java.util.ArrayList;

public class Ex3 {
    private ArrayList<Integer> array;
    private String str;

    public Ex3(){
       this.array = null;
    }

    public Ex3(ArrayList array, String str){
        this.array = array;
        this.str=str;
    }


    public int addition(int value) { //переписать чтобы менял состотяние ex3
        this.array.add(value);
        return this.array.size();
    }

    /*public void get(){
        System.out.println(str);
    }*/
    public void get(String ourString){
        ourString=str;
        return;
    }
}
