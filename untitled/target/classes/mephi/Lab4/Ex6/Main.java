package mephi.Lab4.Ex6;

public class Main {
    public static void main (String args[]) {

        Item item = new Item("Item", 5.4);

        DiscountedItem discounted = new DiscountedItem("Item", 5.4, 0.4);
        DiscountedItem discounted2 = new DiscountedItem("Item", 5.4, 1.5);

        System.out.println("Тестируем симметричность");
        System.out.println(item.equals(discounted));
        System.out.println(discounted.equals(item));
        System.out.println(item.equals(discounted2));
        System.out.println( discounted2.equals(item));

        System.out.println("Тестируем транзитивность ");
        System.out.println(discounted.equals(discounted2));
        System.out.println(discounted2.equals(discounted));

    }
}
