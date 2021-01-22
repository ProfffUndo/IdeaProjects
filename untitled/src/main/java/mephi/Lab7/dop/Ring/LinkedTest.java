package mephi.Lab7.dop.Ring;


public class LinkedTest {
    public static void main(String[] args) {
        LinkedRing<Integer> linkedRing= new LinkedRing<Integer>();

        linkedRing.add(2);
        linkedRing.add(9);
        linkedRing.add(10);
        linkedRing.add(3);
        linkedRing.add(6);

        System.out.println(linkedRing.current());
        System.out.println(linkedRing.previous());
        System.out.println(linkedRing.next());
        System.out.println(linkedRing.next());
        System.out.println(linkedRing.next());
    }


}
