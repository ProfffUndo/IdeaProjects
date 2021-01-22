package mephi.Lab7.dop.Ring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayRing<T> implements Ring<T> {
   private int current;
   ArrayList<T> list;

    ArrayRing(){
        super();
        current=0;
        list=new ArrayList<>();
    }


    @Override
    public T previous() {
        if(size()==0){
            throw new RuntimeException();
        }
        if (current!=0)
        return list.get(current-1);
        else return list.get(size()-1);
    }

    @Override
    public T next() {
        if(size()==0){
            throw new RuntimeException();
        }
        if (current!=size()-1)
        return list.get(current+1);
        else return list.get(0);
    }

    @Override
    public T current() {
        if(size()==0){
            throw new RuntimeException();
        }
        return list.get(current);
    }

    @Override
    public void goNext() {
        if(size()==0){
            throw new RuntimeException();
        }
        if (current==size()-1){
            current=0;
        }
        else current++;
    }

    @Override
    public void goPrev() {
        if(size()==0){
            throw new RuntimeException();
        }
        if (current==0){
            current=size()-1;
        }
        else current--;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        if (size()==0) throw new RuntimeException();
        return new RingIterator<T>(list.listIterator(current));
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(T t) {
        boolean flag = true;
        if(list.isEmpty()) flag = false;
        if (current == size()-1){
            list.add(t);
        }

        else {
            list.add(current, t);
        }
        if(flag) current++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o.equals(current()))
            if(current!=0)
            current--;
            else current=size()-1;
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        list.addAll(current,c);
        return true;

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list.clear();
        current=0;
    }
}
