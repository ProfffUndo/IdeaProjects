package mephi.Lab7.dop.Ring;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedRing<T> implements Ring<T> {
  private int current;
  LinkedList<T> list;
  RingIterator<T> ringIterator;
    LinkedRing(){
        super();
        current=0;
        list=new LinkedList<>();
    }

  
  @Override
    public T previous() {
      if(size()==0){
          throw new RuntimeException();
      }
        return ringIterator.previous();
    }

    @Override
    public T next() {
        if(size()==0){
            throw new RuntimeException();
        }

        return ringIterator.next();
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
        if(flag) {
            current++;
        }
        ringIterator = (RingIterator<T>) iterator();
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o.equals(current()))
            current--;
        list.remove(o);
        ringIterator = (RingIterator<T>) iterator();
       return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        for (int i=0; i<c.size();i++){
            list.add(++current,(T) a[i]);
        }
        ringIterator = (RingIterator<T>) iterator(); //O(n)
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        list.removeAll(c);
        ringIterator = (RingIterator<T>) iterator();
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        list.retainAll(c);
        ringIterator = (RingIterator<T>) iterator();
        return true;
    }

    @Override
    public void clear() {
        list.clear();
        current=0;
    }
}
//TODO: Можно использовать внутри листы
