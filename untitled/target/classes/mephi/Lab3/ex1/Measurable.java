package mephi.Lab3.ex1;

public interface Measurable {
    default double getMeasure(){
        double measure = this.toString().length();
        return measure;
    }
}
