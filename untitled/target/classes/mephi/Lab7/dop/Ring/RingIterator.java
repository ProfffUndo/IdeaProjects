package mephi.Lab7.dop.Ring;

import java.util.ListIterator;

public class RingIterator<T> implements ListIterator<T> {

 RingIterator(ListIterator<T> listIterator){
     this.listIterator=listIterator;
 }


private final ListIterator<T> listIterator;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public T next() {
        if (!listIterator.hasNext()){
            while (listIterator.previousIndex()!=-1){
                listIterator.previous();
            }
        }
        return listIterator.next();
    }

    @Override
    public boolean hasPrevious() {
        return listIterator.hasPrevious();
    }

    @Override
    public T previous() {
        return listIterator.previous();
    }

    @Override
    public int nextIndex() {
        return listIterator.nextIndex();
    }

    @Override
    public int previousIndex() {
        return listIterator.previousIndex();
    }

    @Override
    public void remove() {
        listIterator.remove();
    }

    @Override
    public void set(T t) {
        listIterator.set(t);
    }

    @Override
    public void add(T t) {
        listIterator.add(t);
    }
}
