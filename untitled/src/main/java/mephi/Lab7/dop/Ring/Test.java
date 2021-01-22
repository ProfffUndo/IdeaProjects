package mephi.Lab7.dop.Ring;

import net.sf.javagimmicks.collections.LinkedRing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayRing<Integer> ring = new ArrayRing<>();
        ring.add(2);
        System.out.println(ring.current());
        ring.add(3);
        System.out.println(ring.current());
        ring.add(4);
        System.out.println(ring.current());

        ring.remove(4);
      /*  System.out.println(ring.current());
        ring.goNext();
        System.out.println(ring.current());
        ring.goPrev();
        System.out.println(ring.current());
        ring.previous();*/
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        ring.addAll(arrayList);
        System.out.println(ring.current());
        for (int i = 0; i < 15; i++){
            System.out.println(ring.current());
            ring.goNext();
        }
        System.out.println("size="+ring.size());
        System.out.println(ring.previous());
        System.out.println(ring.current());
        System.out.println(ring.next());

/*        System.out.println("Iterator test");
        Iterator<Integer> iterator = ring.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        /*LinkedRing<Integer> linkedRing = new LinkedRing<>();
        linkedRing.add(2);
        linkedRing.add(3);
        linkedRing.add(4);
        System.out.println(ring.get(1));
        System.out.println(ring.get(6));*/


    }
}
