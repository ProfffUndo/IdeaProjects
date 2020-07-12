package mephi.Lab2.ex15;

public class ex15 {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        inv.addItem("Sub1",2,30);
        inv.addItem("Sub2", 3, 60);
        inv.addItem("Sub3", 4, 100);
        inv.print();
    }
}
