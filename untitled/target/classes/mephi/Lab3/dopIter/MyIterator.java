package mephi.Lab3.dopIter;

import mephi.Lab3.MyFilterIterator.MyFilterIterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface MyIterator<T>{
    public boolean hasNext();
    /*public default T next(){
        if(hasNext()){
            return next();
        }
        else
            return null;
    }*/
    public T next();
   /* public default MyIterator<T> fromIterator(Iterator<T> iterator){
       MyIterator<T> newIter= ()->iterator.hasNext();
       return newIter;
    }*/

   public static  <T>  MyIterator<T> fromIterator(Iterator<T> iterator){
       return new MyIterator<T>() {
           @Override
           public boolean hasNext() {
               return iterator.hasNext();
           }

           @Override
           public T next() {
               return iterator.next();
           }
       };
   }

    public default void forEach(Consumer<T> consumer){
        while (hasNext()){
            consumer.accept(next());
        }
    }

    public default Collection<T> collect (Supplier<Collection<T>> supplier){
        Collection<T> collection = supplier.get();
        while (hasNext()){
            collection.add(next());
        }
        return collection;
    }

    public default <U> MyIterator<U> map(Function<T,U> function){
       MyIterator<T> iterator = this;
       return new MyIterator<U>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public U next() {
                return function.apply(iterator.next());
            }
        };
    }
/*
 if (iterator.hasNext()) {
            pointer= iterator.next();
            if (first==null){
                first=pointer;
            }
            if(predicate!=null) {
                if (!predicate.test(pointer)) {
                    while (!predicate.test(pointer) /*|| pointer == null) {
        if (iterator.hasNext())
            pointer = iterator.next();
        else return false;
    }
}
            }
                    return true;//this.iterator.hasNext();
                    }
                    else return false;
 */

    public default MyIterator<T> filter(Predicate<T> predicate){
        MyIterator<T> iterator = this;
        return new MyIterator<T>() {
            T pointer;
            boolean isNext=false;
            @Override
            public boolean hasNext() {
               if(isNext){
                   return true;
               }
               else
                   return nextObject();
            }
            @Override
            public T next() {
                if (!isNext){
                    if(!nextObject()){
                        throw new NoSuchElementException();
                    }
                }
                isNext=false;
                return pointer;
            }
            private boolean nextObject() {
                while (iterator.hasNext()){
                    T object = iterator.next();
                    if(predicate.test(object)){
                        pointer=object;
                        isNext=true;
                        return true;
                    }
                }
                return false;
            }
        };
    }


}