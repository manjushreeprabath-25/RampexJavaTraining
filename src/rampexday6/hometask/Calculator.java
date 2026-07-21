package rampexday6.hometask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number,A: ");
        int a = sc.nextInt();
        System.out.print("Enter a number,B: ");
        int b = sc.nextInt();
        int choice;;
        do {
            System.out.println("\nWelcome User");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    int addResult = a + b;
                    System.out.println("Add: " + addResult );
                    break;
                case 2:
                    int subtractResult = a - b;
                    System.out.print("Subtract: " + subtractResult);
                    break;
                case 3:
                    int multiplyResult = a * b;
                    System.out.print("Multiply: "+ multiplyResult);
                    break;
                case 4:
                    int divideResult = a * b;
                    System.out.print("Divide: "+ divideResult);
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid Number! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}