package mephi.Lab7.ex1;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

public class Ex1 {
        public static void main (String[]args){

            System.out.println("\nprimesHashSet(30)");
            System.out.println(Arrays.toString(primesHashSet(30)));
            // [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

            System.out.println("\nprimesBitSet(30)");
            System.out.println(Arrays.toString(primesBitSet(30)));
            // [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29]

        }

        public static int[] primesHashSet (int n){
            n = Math.abs(n);
            if (n == 0)
                return new int[]{};
            if (n == 1)
                return new int[]{1};
            if (n == 2)
                return new int[]{1, 2};
            if (n == 3 || n == 4)
                return new int[]{1, 2, 3};
            if (n == 5 || n == 6)
                return new int[]{1, 2, 3, 5}; //До сюда проверяем просто число
            HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 5));
            for (int i = 7; i <= n; i++)
                hs.add(i); //Добавляем все числа
            int c = 0;
            double limit = Math.sqrt(n);
            for (int i = 2; i <= limit; i++) { //Условие: Поиск завершается i^2>n
                int sq = i * i;
                c = 0;
                while (true) {
                    int v = sq + i * c; //Удаление элементов i2, i(i+1) i(i+2) и т.д.
                    if (v <= n) {
                        hs.remove(v);
                        c++;
                    } else {
                        break;
                    }
                }
            }
            int[] out = new int[hs.size()];
            Iterator<Integer> it = hs.iterator();
            c = 0;
            while (it.hasNext()) {
                out[c] = it.next();
                c++;
            }
            return out;
        }

        public static int[] primesBitSet ( int n){
            n = Math.abs(n);
            if (n == 0)
                return new int[]{};
            if (n == 1)
                return new int[]{1};
            if (n == 2)
                return new int[]{1, 2};
            if (n == 3 || n == 4)
                return new int[]{1, 2, 3};
            if (n == 5 || n == 6)
                return new int[]{1, 2, 3, 5};
            BitSet bs = new BitSet(n);
            bs.set(1, 4);
            bs.set(5);
            for (int i = 7; i <= n; i++)
                bs.set(i);
            int c = 0;
            double limit = Math.sqrt(n);
            for (int i = 2; i <= limit; i++) {
                int sq = i * i;
                c = 0;
                while (true) {
                    int v = sq + i * c;
                    if (v <= n) {
                        bs.set(v, false);
                        c++;
                    } else {
                        break;
                    }
                }
            }
            return bs.stream().toArray();
        }
}
