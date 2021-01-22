package mephi.Lab2.ex4;

public class ex4 {
    public static void main(String[] args) {
        IntHolder a = new IntHolder ();
        IntHolder b = new IntHolder (1);
        IntHolder c = a;
        a = b;
        b = c;
        System.out.println(a.getValue());
        System.out.println(b.getValue());
    }
}
