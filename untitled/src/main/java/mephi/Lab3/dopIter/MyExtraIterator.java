package mephi.Lab3.dopIter;

import mephi.Lab3.MyFilterIterator.MyFilterIterator;

import java.util.Iterator;
import java.util.function.Predicate;

public class MyExtraIterator<T> implements MyIterator<T> {
    private Iterator<T> iterator;
    private Predicate<T> predicate;
    private T pointer;


    public MyExtraIterator(Iterator<T> iterator, Predicate<T> predicate) {
        this.iterator = iterator;
        this.predicate=predicate;
    }

    public MyExtraIterator(Iterator<T> iterator) {
        this.iterator = iterator;
        this.predicate=null;
    }

    @Override
   public boolean hasNext() {
        if (iterator.hasNext()) {
            pointer = iterator.next();
            if (predicate != null) {
                if (!predicate.test(pointer)) {
                    while (!predicate.test(pointer) /*|| pointer == null*/) {
                        if (iterator.hasNext())
                            pointer = iterator.next();
                        else return false;
                    }
                }
            }
            return true;
        }
        else return false;
    }

    @Override
    public T next() {
        if (pointer == null) {
            return null;
        } else {
            return pointer;
        }
    }


        public MyExtraIterator<T> fromIterator(Iterator<T> iterator){
            return new MyExtraIterator<T>(iterator);
        }

    public MyExtraIterator<T> filter(Predicate<T> predicate){
        if (this.predicate == null) {
            return new MyExtraIterator<T>(this.iterator, predicate);
        }
        else{
            return new MyExtraIterator<T>(this.iterator, (c1) -> this.predicate.test(c1) && predicate.test(c1));
        }

    }

        /*public MyExtraIterator<T> filter(Predicate<T> predicate){
            if (this.predicate == null) {
                return new MyExtraIterator<T>(this.iterator, predicate);
            }
            else{
                return new MyExtraIterator<T>(this.iterator, (c1) -> this.predicate.test(c1) && predicate.test(c1));
            }

        }*/

}
