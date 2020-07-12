package mephi.Lab2.ex15;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        System.out.printf("Description\tQuantity\tunitPrice\n");
        for (Item item : items) {
            System.out.printf("%s\t\t",item.description);
            System.out.printf("%d\t\t\t",item.quantity);
            System.out.printf("%f\t\n",item.unitPrice);

            total += item.price();
        }
        System.out.printf("Total:%f\t",total);
    }
}
