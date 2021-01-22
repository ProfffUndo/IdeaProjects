package mephi.Lab2.ex9;
public class Car {
    private double x = 0; //положение относительно начала координат
    private static final double MAX_FUEL = 100;
    private double fuel; //текущее количество топлива
    private double consumption; //расход

    public Car(){
        this.fuel = MAX_FUEL;
        consumption = 5;
    }

 /*   public Car(double x){
        this.x = x;
        fuel = MAX_FUEL;
    }*/

    public Car(double consumption){
        this.fuel = MAX_FUEL;
        this.consumption= consumption;
    }

    public Car(double consumption,double fuel){
       // this.x = x;
        if (fuel < MAX_FUEL) {
            this.fuel = fuel;
        }
        else {
            this.fuel = MAX_FUEL;
        }
        this.consumption = consumption;
    }

    public double getX() {
        return x;
    }

    public double getFuel(){
        return fuel;
    }

    public Car refuel (double newFuel)
    {
        if (newFuel+this.fuel < MAX_FUEL) {
            this.fuel+=newFuel;
            System.out.printf("You have now %f liters of fuel\n", this.fuel);
        }
        else {
            this.fuel = MAX_FUEL;
            System.out.println("Fuel tank is full. 100 liters!");
        }
        return this;
    }

    public boolean isFuelempty(){
        if (fuel == 0) return true;
        else return false;
    }

    public static boolean isCar(){
        return true;
    }

    public Car replace (double move){
        double needFuel = Math.abs(move/consumption); // Вычисление необходимого топлива для поездки
        if (needFuel < fuel) {
            x += move;
            this.fuel = this.fuel - needFuel;
            System.out.printf("Car moved successfully on %f",move);

        }
        else{
           x+=this.fuel*consumption*Math.signum(move); //Едем пока бензин не кончится
            this.fuel = 0;
            System.out.println("Fuel is over!");
        }
        return this;
    }

    public boolean isFuelLow(Car car) {
        if (fuel < MAX_FUEL/10) return true;
        else
            return false;
    }

    public static Car makeCar(Boolean aBoolean) {

            if (aBoolean) {
                Car newCar = new Car(10, MAX_FUEL);
                return newCar;
            }
            else{
                Car newCar2= new Car(10,0);
                return newCar2;
            }
        }
}
