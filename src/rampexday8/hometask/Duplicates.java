package rampexday8.hometask;


    public class Duplicates {
        public static void main(String[] args) {
            int[] numbers = {2,5,7,2,8,5,9,7,7};
            System.out.print("Duplicate elements: ");
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.print(numbers[i] + " ");
                        break; // Prevents printing the same duplicate multiple times
                    }
                }
            }
        }
    }

