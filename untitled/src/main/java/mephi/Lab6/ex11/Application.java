package mephi.Lab6.ex11;

import static mephi.Lab6.ex11.Ex11.min;

public class Application {
    public static void main(String[] args) {
        String[] stringArr = new String[]{"a","b","c","d","e"};
        System.out.println(min(stringArr));

        B[] bArr = new B[] {new B(1),new B(2)};

        System.out.println(min(bArr));

        min(bArr);

        A aArr[] = new A[] {new A(1), new B(2), new B(-1)};

        A aa = min (aArr);
        System.out.println(aa);
        B bb = min(aArr);
        System.out.println(bb);
    }

    static class A implements Comparable<A>{
        int a;
        A(int a){
            this.a = a;
        }

        @Override
        public String toString() {
            return "A"+a;
        }

        @Override
        public int compareTo(A o) {

            if(a>o.a)
                return 1;
            else return -1;
        }
    }

    static class B extends A {

        B(int a) {
            super(a);
        }
        int b;

        @Override
        public String toString() {
            return "B"+a;
        }
    }

    static class C implements Comparable<C>{

        @Override
        public int compareTo(C o) {
            return 0;
        }

    }

}
