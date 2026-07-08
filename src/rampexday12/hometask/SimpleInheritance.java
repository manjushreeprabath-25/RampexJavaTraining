package rampexday12.hometask;


class Car2 {

    void start() {
        System.out.println("Car Started");
    }
}

class SportsCar2 extends Car2 {

    void turbo() {
        System.out.println("Turbo Enabled");
    }
}

public class SimpleInheritance {

    public static void main(String[] args) {

        SportsCar2 car = new SportsCar2();

        car.start();
        car.turbo();
    }
}