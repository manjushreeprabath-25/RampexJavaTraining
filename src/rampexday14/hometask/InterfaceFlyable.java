package rampexday14.hometask;



interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flapping wings");
    }
}
class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is engaging engines");
    }
}
public class InterfaceFlyable {
    public static void main(String[] args) {
        Flyable[] flyers = {new Bird(), new Airplane()};

        for (Flyable f : flyers) {
            f.fly();
        }
    }
}
