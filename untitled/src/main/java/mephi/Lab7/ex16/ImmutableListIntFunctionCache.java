package mephi.Lab7.ex16;

import mephi.Lab7.Ex15.ImmutableListIntFunction;
import mephi.Lab7.ex13.Cache;

import java.util.Iterator;
import java.util.function.IntFunction;

public class ImmutableListIntFunctionCache extends ImmutableListIntFunction {
    Cache <Integer,Integer> cache = new Cache<>(100);
    public ImmutableListIntFunctionCache(int i, IntFunction<Integer> intFunction) {
        super(i, intFunction);
    }

    @Override
    public Integer get(int index) {
        if(index<=size() && index>=0) {
            cache.put(index, intFunction.apply(index));
            return intFunction.apply(index);
        } else{
            throw new IndexOutOfBoundsException("IndexOutOfBoundsOfList");
        }
    }
}
