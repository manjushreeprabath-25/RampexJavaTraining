package rampexday14.hometask;

import java.util.Scanner;

public class ParallelArrayUsingException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Drink[] billItems = new Drink[100];
        int[] quantities = new int[100];

        int pos = 0;
        float total = 0;
        int choice;

        System.out.println("WELCOME !!!");

        do {
            System.out.println("\n1. Maza");
            System.out.println("2. Sprite");
            System.out.println("3. Pepsi");
            System.out.println("4. Campa");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0)
                break;

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            try {
                if (qty <= 0) {
                    throw new IllegalArgumentException(
                            "Quantity cannot be negative or zero");
                }

                Drink d = null;

                switch (choice) {
                    case 1:
                        d = new Maza();
                        break;
                    case 2:
                        d = new Sprite();
                        break;
                    case 3:
                        d = new Pepsi();
                        break;
                    case 4:
                        d = new Campa();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }

                if (d != null) {

                    if (qty > d.stock) {
                        System.out.println("Only " + d.stock +
                                " items available in stock.");
                        continue;
                    }

                    d.stock -= qty;

                    total += qty * d.price;

                    billItems[pos] = d;
                    quantities[pos] = qty;
                    pos++;

                    System.out.println(d.name + " added to cart.");
                    System.out.println("Remaining Stock: " + d.stock);
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (true);

        // Bill Printing
        System.out.println("\n========== BILL ==========");
        System.out.printf("%-10s %-10s %-10s %-10s%n",
                "Item", "Qty", "Price", "Amount");

        for (int i = 0; i < pos; i++) {
            float amount = quantities[i] * billItems[i].price;

            System.out.printf("%-10s %-10d %-10.2f %-10.2f%n",
                    billItems[i].name,
                    quantities[i],
                    billItems[i].price,
                    amount);
        }

        System.out.println("--------------------------");
        System.out.println("Total Bill = " + total);
    }
}

class Drink {
    String name;
    float price;
    int stock;
}

class Maza extends Drink {
    Maza() {
        name = "Maza";
        price = 20;
        stock = 50;
    }
}

class Sprite extends Drink {
    Sprite() {
        name = "Sprite";
        price = 30;
        stock = 40;
    }
}

class Pepsi extends Drink {
    Pepsi() {
        name = "Pepsi";
        price = 25;
        stock = 30;
    }
}

class Campa extends Drink {
    Campa() {
        name = "Campa";
        price = 10;
        stock = 60;
    }
}
