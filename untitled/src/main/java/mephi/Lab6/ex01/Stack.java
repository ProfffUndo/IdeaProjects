package mephi.Lab6.ex01;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<E> {
   private ArrayList<E> array;

   public Stack(){
       array=new ArrayList<>();
   }
    public void push(E el){
        array.add(el);
    };

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        E res = array.get(array.size()-1);
        array.remove(array.size()-1);
       return res;
    };

    public boolean isEmpty(){
        if (array.size()==0)
            return true;
        else
            return false;
    };
}
