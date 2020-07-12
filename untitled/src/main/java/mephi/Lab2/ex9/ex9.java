package mephi.Lab2.ex9;

public class ex9 {
    public static void main(String[] args) {
    Car lada1 = new Car();
    Car lada2 = new Car(5);
    Car lada3 = new Car (10,90);

    System.out.println("Lada1");
    System.out.println(lada1.getFuel());
    System.out.println(lada1.getX());
    lada1.replace(50);
    System.out.println();
    System.out.println(lada1.getFuel());
    System.out.println(lada1.getX());

    System.out.println("Lada2");
    System.out.println(lada2.getFuel());
    System.out.println(lada2.getX());
    lada2.replace(500);
    System.out.println(lada2.getFuel());
    System.out.println(lada2.getX());
    lada2.refuel(50);
    System.out.println(lada2.getFuel());
    }

}
