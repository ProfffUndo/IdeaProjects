package mephi.Lab3.MyFilterIterator;

import mephi.Lab3.MyIteratorTransformation.MyTransIterator;
import mephi.Lab3.dopIter.MyIterator;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyFilterIterator<T> {
    private  Iterator<T> iterator;
    private Predicate<T> predicate;
    private T pointer;
    private T first;

    public MyFilterIterator(Iterator<T> iterator, Predicate<T> predicate) {
        this.iterator=iterator;
        this.predicate = predicate;
    }

    public MyFilterIterator<T> fromIterator(Iterator<T> iterator) {
        return new MyFilterIterator(iterator);
    }

    public MyFilterIterator(Iterator iterator){
        this.iterator=iterator;
        predicate = new Predicate<T>() {
            @Override
            public boolean test(T t) {
                return true;
            }
        };
    }



    public boolean hasNext() {
        if (iterator.hasNext()) {
            pointer= iterator.next();
            if (first==null){
                first=pointer;
            }
            if(predicate!=null) {
                if (!predicate.test(pointer)) {
                    while (!predicate.test(pointer) /*|| pointer == null*/) {
                        if (iterator.hasNext())
                            pointer = iterator.next();
                        else return false;
                    }
                }
            }
            return true;//this.iterator.hasNext();
        }
        else return false;
    }


    public T next() {
        //if(hasNext()) {
            //pointer = iterator.next();
            /*if (!predicate.test(pointer)) {
                while (!predicate.test(pointer) /*|| pointer == null) {
                    if (hasNext())
                        pointer = iterator.next();
                }
            }*/
            {
                if (pointer == null) {
                    return null;
                } else {
                    return pointer;
                }
            }
    //    }
    //    else return null;
    }

    /*
    public T next() {
        //if(hasNext()) {
           // pointer = iterator.next();
            /*if (!predicate.test(pointer)) {
                while (!predicate.test(pointer) /*|| pointer == null) {
                    if (hasNext())
                        pointer = iterator.next();
                }
            }
            if (pointer == null) {
        return null;
    } else {
        return pointer;
    }
    //    }
    //    else return null;
}
*/


    public void forEach(Consumer consumer) {
        while (hasNext()){
            consumer.accept(next());
        }
    }

    public Collection<T> collect (Supplier<Collection<T>> supplier){ //возвращает новый экземпляр коллекции заполненной MyIter элементами
        Collection<T> collection = supplier.get();
        while (hasNext()){
            collection.add(next());
        }
        return collection;
    }

    public MyFilterIterator<T> filter(Predicate<T> predicate){
        if (this.predicate == null) {
            return new MyFilterIterator<T>(this.iterator, predicate);
        }
        else{
            return new MyFilterIterator<T>(this.iterator, (c1) -> this.predicate.test(c1) && predicate.test(c1));
        }

    }

    public MyFilterIterator<T> map(Function<T, ?> function){
        Consumer <T> consumer = (x)-> function.apply(x);
        forEach(consumer);
        return new MyFilterIterator<T>(this.iterator,this.predicate);
    }


}
