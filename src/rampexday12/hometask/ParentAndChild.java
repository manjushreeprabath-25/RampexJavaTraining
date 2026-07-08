package rampexday12.hometask;


class Car9 {

    Car9() {
        System.out.println("Car Ready");
    }

    void display() {
        System.out.println("Normal Car");
    }
}

class SportsCar6 extends Car9 {

    void display() {
        System.out.println("Sports Car");
    }
}

class ParentAndChild {

    public static void main(String[] args) {

        SportsCar6 car = new SportsCar6();

        car.display();
    }
}