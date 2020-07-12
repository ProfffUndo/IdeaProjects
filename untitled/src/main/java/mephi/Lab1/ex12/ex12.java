package mephi.Lab1.ex12;   //Array.List.java /java/util

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the size");
        int m = in.nextInt();
      //  int[] example = null;
        int[] example = new int [5];
        int[] es = new int[5];
        int[] es2 = new int[5];
        es[1]=2;
        if (example == null) {
            for (int i = 0; i < es.length; i++)
                if (es[i] == 2)
                    break;

        }
        else {
            for (int i = 0; i < es2.length; i++)
                if (es[i] == 2)
                    break;
        }
        /*  Object[] o = new Object[]{1, 2, 3};
        ArrayList<Integer> example = null;
       // ArrayList<Integer> example = new ArrayList<>();
     //   example.add(1);
      //  example.add(2);
      //  example.add(3);
        Object[] elementData = new Object[]{0, 1, 2};
        final Object[] es = elementData;

        if (example == null) {
            for (int i = 0; i < es.size(); i++)
                if (es[i] == null)
                    break;
        } else {
            for (int i = 0; i < example.size(); i++)
                if (o.equals(es[i]))
                    break;
        }
    }*/
    }
}
 //int m = in.nextLine;
 //int[]square = new int[m];

 /*   public static boolean remove(Object o){
        ArrayList <Integer> example = new ArrayList<>() ;
        Object[] elementData = new Object[]{0,1,2};
        final Object[] es = elementData;
        found:
        if (example == null) {
            for (int i=0; i < example.size(); i++)
                if (es[i] == null)
                    break;
        }
        else{
            for (int i=0; i < example.size(); i++)
                if (o.equals(es[i]))
                    break found;
        }
        return false;
    }
}*/

//public boolean remove(Object o) {
//        final Object[] es = elementData;
//        final int size = this.size;
//        int i = 0;
//        found: {
//            if (o == null) {
//                for (; i < size; i++)
//                    if (es[i] == null)
//                        break found;
//            } else {
//                for (; i < size; i++)
//                    if (o.equals(es[i]))
//                        break found;
//            }
//            return false;
//        }
//        fastRemove(es, i);
//        return true;
//    }