package rampexday12.hometask;



class Engine {

    void ignite() {
        System.out.println("Engine Started");
    }
}

class Car5 {

    Engine engine = new Engine();

    void drive() {
        engine.ignite();
        System.out.println("Car Moving");
    }
}

public class HasARelationship {

    public static void main(String[] args) {

        Car5 car = new Car5();

        car.drive();
    }
}