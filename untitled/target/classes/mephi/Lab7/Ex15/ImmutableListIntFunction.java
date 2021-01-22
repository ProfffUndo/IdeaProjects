package mephi.Lab7.Ex15;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntFunction;

public class ImmutableListIntFunction implements List<Integer> {
    private int n;
    protected IntFunction<Integer> intFunction;

    public ImmutableListIntFunction(int i, IntFunction<Integer> intFunction){
      n=i;
      this.intFunction=intFunction;
    }

    @Override
    public int size() {
        return n+1;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Integer){
            int obj=(Integer)o;
          for (int i=0; i<size(); i++){
              if(obj==intFunction.apply(i)){
                  return true;
              }
          }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current =0;
            @Override
            public boolean hasNext() {
                return this.current <size();
            }

            @Override
            public Integer next() {
                if (this.current>size()-1){
                    throw new NoSuchElementException("Too Big");
                }

                return intFunction.apply(current++);

            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] integers = new Object[size()];
        for (int i=0; i<size();i++){
            integers[i]=intFunction.apply(i);
        }
        return integers;
    }



    @Override
    public boolean add(Integer integer)  {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e))
                return false;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public Integer get(int index) {
        if(index<=size() && index>=0)
            return intFunction.apply(index);
        else{
            throw new IndexOutOfBoundsException("IndexOutOfBoundsOfList");
        }
    }

    @Override
    public Integer set(int index, Integer element) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public void add(int index, Integer element) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public Integer remove(int index) {
        throw new UnsupportedOperationException("Immutable List");
    }

    @Override
    public int indexOf(Object o) {
        if (o instanceof Integer){
            int obj=(Integer)o;
            for (int i=0; i<size(); i++){
                if(obj==intFunction.apply(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o instanceof Integer){
            int obj=(Integer)o;
            for (int i=size(); i>0; i--){
                if(obj==intFunction.apply(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return new ListIterator<Integer>() {
            private int current=0;
            @Override
            public boolean hasNext() {
                return this.current <size();
            }

            @Override
            public Integer next() {
                if (this.current>size()-1){
                    throw new NoSuchElementException("Too Big");
                }
                return intFunction.apply(this.current++);
            }

            @Override
            public boolean hasPrevious() {
                return this.current-1 >=0;
            }

            @Override
            public Integer previous() {
                if (this.current-1 >=0) return intFunction.apply(current-1);
                else throw new NoSuchElementException("No Previous");
            }

            @Override
            public int nextIndex() {
                if (this.current>size()-1){
                    throw new NoSuchElementException("Too Big");
                }
                return this.current++;
            }

            @Override
            public int previousIndex() {
                if (this.current-1 >=0) return this.current -1;
                else throw new NoSuchElementException("No Previous");
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Can not remove");
            }

            @Override
            public void set(Integer integer) {
                throw new UnsupportedOperationException("Can not set");
            }

            @Override
            public void add(Integer integer) {
                throw new UnsupportedOperationException("Can not add");
            }
        };
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException("IndexOutOfBounds");
        return new ListIterator<Integer>() {
            private int current = index;
            @Override
            public boolean hasNext() {
                return this.current <size();
            }

            @Override
            public Integer next() {
                if (this.current>size()-1){
                    throw new NoSuchElementException("Too Big");
                }
                return intFunction.apply(this.current++);
            }

            @Override
            public boolean hasPrevious() {
                return this.current-1 >=0;
            }

            @Override
            public Integer previous() {
                if (this.current-1 >=0) return intFunction.apply(this.current -1);
                else throw new NoSuchElementException("No Previous");
            }

            @Override
            public int nextIndex() {
                if (this.current>size()-1){
                    throw new NoSuchElementException("Too Big");
                }
                return this.current++;
            }

            @Override
            public int previousIndex() {
                if (this.current-1 >=0) return this.current -1;
                else throw new NoSuchElementException("No Previous");
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Can not remove");
            }

            @Override
            public void set(Integer integer) {
                throw new UnsupportedOperationException("Can not set");
            }

            @Override
            public void add(Integer integer) {
                throw new UnsupportedOperationException("Can not add");
            }
        };
    }


    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        T[] result;
        if (a.length >=size()){
            result = a;
        }
        else{
            @SuppressWarnings("uncheked")
            T[] newArray =(T[]) Array.newInstance(a.getClass().getComponentType(),size());
            result=newArray;
        }
        for(Integer i =0; i<size();i++){
            result[i]=(T) intFunction.apply(i);
        }
        return result;
    }
}
