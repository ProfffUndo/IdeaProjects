package mephi.Lab3.dop3;

import mephi.Lab2.ex9.Car;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Car lada1 = new Car();
        Car lada2 = new Car(5);
        Car lada3 = new Car(10, 90);
        CheckCar ar = Car::isFuelempty; //Class::instance method
        test(lada1, car -> car.isFuelempty()); //lambda
        test (lada2, ar);
        CheckCar ar2 = lada1::isFuelLow; //Object::instance method
        test2(lada3,ar2);
        Function<Boolean,Car> function= Car::makeCar; //Class::staticmethod
        PersonInterface personInterface = Person::new;//конструктор
        Person person = personInterface.create("Peter", "Parker");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }

    private static void test (Car car, CheckCar myInter){
        if (myInter.check(car)){
            System.out.println("No Fuel");
        }
        else System.out.println("Fuel is not empty");
    }

    private static void test2 (Car car, CheckCar myInter){
        if (myInter.check(car)){
            System.out.println("Fuel is low");
        }
        else System.out.println("Fuel is more than 10 percent");
    }
}
