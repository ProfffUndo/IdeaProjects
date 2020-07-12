package mephi.Lab3.ex1;

public class Main {

    public static void main(String[] args) {
        Employee alex = new Employee(500);
        Employee michael = new Employee(490);
        Employee denis = new Employee(580);

        Employee[] example = new Employee[3];
        example[0]=alex;
        example[1]=michael;
        example[2]=denis;
    }
    public static double average(Measurable[] objects) {
        double sumSalary = 0;
        double res = 0;
        for (int i = 0; i < objects.length; i++) {
            sumSalary += objects[i].getMeasure();
        }
        res = sumSalary/objects.length;
        return res;
    }
    Measurable largest (Measurable[] objects){
        Measurable max = objects[0];
        for (int i=1; i<objects.length;i++){
            if (objects[i].toString().length() > max.toString().length()){
                max = objects[i];
            }
        }
        return max;
    }


}
