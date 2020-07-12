package mephi.Lab4.Ex1;

import java.util.Objects;

public class LabeledPoint extends Point {
    String label;

    LabeledPoint(String name, double x, double y) {
        super(x, y);
        this.label=name;
    }

    public String getLabel(){
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       if (super.equals(o)) return true;
       else return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
