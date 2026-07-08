package rampexday12.hometask;



class Car3 {

    void start() {
        System.out.println("Car Started");
    }
}

class SportsCar3 extends Car3 {

    void start() {
        System.out.println("Sports Car Started");
    }
}

public class ParentReference {

    public static void main(String[] args) {

        Car3 car = new SportsCar3();

        car.start();
    }
}
