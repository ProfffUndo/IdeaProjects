package mephi.Lab6.dop.presentation.task2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackWithoutGenerics {
    private final ArrayList<Object> array;

    public StackWithoutGenerics(){
        array=new ArrayList<Object>();
    }
    public void push(Object el){
        array.add(el);
    };

    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object res = array.get(array.size()-1);
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