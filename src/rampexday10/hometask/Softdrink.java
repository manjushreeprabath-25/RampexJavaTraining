package rampexday10.hometask;


    import java.util.Scanner;
    class Softdrink {
        String[] drinks = {"pepsi", "sprite", "maza", "mountain dew", "campa"};
        int[] prices = {40, 20, 45, 40, 10};
        int[] stock = {5, 5, 5, 5, 5};
        int totalBill = 0;

        void displayDrinks() {
            System.out.println("Available Drinks:");
            for (int i = 0; i < drinks.length; i++) {
                System.out.println(drinks[i] + " - Rs." + prices[i] + " Stock: " + stock[i]);
            }
        }

        void buyDrink(String name, int qty) {

            for (int i = 0; i < drinks.length; i++) {

                if (name.equalsIgnoreCase(drinks[i])) {

                    if (qty <= stock[i]) {
                        totalBill += prices[i] * qty;
                        stock[i] -= qty;

                        System.out.println(qty + " " + drinks[i] + " purchased.");
                        System.out.println("Remaining Stock: " + stock[i]);
                    } else {
                        System.out.println("Insufficient Stock!");
                    }
                    return;
                }
            }
            System.out.println("Drink not found!");
        }
        void printBill() {
            System.out.println("Total Amount = Rs." + totalBill);
        }
    }

    class ParallelArrays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Softdrink shop = new Softdrink();
            shop.displayDrinks();
            while (true) {
                System.out.print("\nEnter Drink Name (or exit): ");
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                sc.nextLine();
                shop.buyDrink(name, qty);
            }
            shop.printBill();
            sc.close();
        }
    }

