package mephi.Lab7.dop.Ring;

import java.util.LinkedList;

public class LinkedRing<T> extends LinkedList<T> implements Ring<T> {
  private int current;
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
