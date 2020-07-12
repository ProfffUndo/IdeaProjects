package mephi.Lab4.Ex6;

import java.util.Objects;

public class DiscountedItem  extends Item{
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount=discount;
    }

    public boolean equals(Object otherObject) {

        if(!super.equals(otherObject)) return false;

        if(otherObject.getClass() == this.getClass()) {

            DiscountedItem discounted =(DiscountedItem) otherObject;
            return Objects.equals(this.discount, discounted.discount);
        }

        else return super.equals(otherObject);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
