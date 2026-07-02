package rampexday10.hometask;

class Laptop {
    String brand;
    String model;
    int ram;
    int memory;

    Laptop(String brand, String model, int ram, int memory) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }

    void installApp(String appName) {
        ram = ram - 1;
        System.out.println(appName + " is installed in " +
                brand + " " + model +
                " RAM available: " + ram + " GB");
    }
}
    class LaptopTest {
        public static void main(String[] args) {
            Laptop laptop = new Laptop("Lenovo", "12", 8, 256);
            laptop.installApp("Chrome");
            laptop.installApp("Brave");
            laptop.installApp("VS Code");
            laptop.installApp("Zoom");
            laptop.installApp("Spotify");
        }
    }

