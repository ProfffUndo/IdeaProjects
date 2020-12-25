package mephi.Lab7.dop.Ring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

public class ArrayRing<T> extends ArrayList<T> implements Ring<T> {
   protected int current;

    ArrayRing(){
        super();
        current=0;
    }

    ArrayRing(int initialCapacity){
        super(initialCapacity);
    }

    ArrayRing(int initialCapacity,int current){
        super(initialCapacity);
        this.current = current;
    }

    ArrayRing(Collection<?extends T> collection){
        super(collection);
        current=0;
    }

    ArrayRing(Collection<?extends T> collection, int current){
        super(collection);
        this.current=current;
    }

    @Override
    public T previous() {
        return get(current-1);
    }

    @Override
    public T next() {
        return get(current+1);
    }

    @Override
    public T current() {
        return get(current);
    }

    @Override
    public void goNext() {
        if (current==size()){
            current=0;
        }
        else current++;
    }

    @Override
    public void goPrev() {
        if (current==0){
            current=size()-1;
        }
        else current--;
    }

    @Override
    public T get(int index) {
        if (index<size())
        return super.get(index);
        else return super.get(index%size());
    }
}
