package rampexday12.hometask;


class Engine4 {

    Engine4() {
        System.out.println("Engine Ready");
    }
}

class MusicSystem {

    MusicSystem() {
        System.out.println("Music System Ready");
    }
}

class Car8 {

    Engine4 engine = new Engine4();
    MusicSystem music = new MusicSystem();

    Car8() {
        System.out.println("Car Ready");
    }
}

public class CarMusicSystem {

    public static void main(String[] args) {

        Car8 car = new Car8();
    }
}
