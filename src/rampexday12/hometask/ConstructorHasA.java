package rampexday12.hometask;
class Engine2 {

    Engine2() {
        System.out.println("Engine Created");
    }
}

class Car6 {

    Engine2 engine = new Engine2();

    Car6() {
        System.out.println("Car Created");
    }
}

public class ConstructorHasA {

    public static void main(String[] args) {

        Car6 car = new Car6();
    }
}
