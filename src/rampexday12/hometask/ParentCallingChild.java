package rampexday12.hometask;



class Car10 {

    void start() {
        System.out.println("Car Started");
    }
}

class SportsCar7 extends Car10 {

    void turbo() {
        System.out.println("Turbo Enabled");
    }
}

public class ParentCallingChild {

    public static void main(String[] args) {

        Car10 car = new SportsCar7();

        car.start();

//        car.turbo();
    }
}
