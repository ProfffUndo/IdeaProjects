package mephi.Lab3.MyIteratorTransformation;

import mephi.Lab3.MyFilterIterator.MyFilterIterator;
import mephi.Lab3.dopIter.MyIterator;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MyTransIterator<T,U>{

    private final Iterator<T> iterator;
    private  Function <T,U> function;
    private T pointer;

    public static <T,U> MyTransIterator<T,U> fromIterator(Iterator<T> iterator) {
        return new MyTransIterator(iterator, (k)->(U)k);
    }

    public MyTransIterator(Iterator iterator){
        this.iterator=iterator;
        this.function=(k)->(U)k;
    }

    public MyTransIterator(Iterator iterator, Function<T, U> function) {
        this.iterator=iterator;
        this.function = function;
    }

    /*public default MyFilterIterator<T> map(Function<T,?> function){
        Consumer <T> consumer = (x)-> function.apply(x);
        forEach(consumer);
        return this;
    }*/

    public boolean hasNext() {
        return this.iterator.hasNext();
    }


    public U next() {
        pointer =iterator.next();
       /* if(pointer == null){
            return null;
        }
        else{*/
            return function.apply(pointer);
        //}
    }

    public void forEach(Consumer<U> consumer) {
        while (hasNext()){
            consumer.accept(this.next());
        }
    }

    public MyTransIterator map(Function function){
        this.function=function;
        return new MyTransIterator(this.iterator,function);
    }

    }
