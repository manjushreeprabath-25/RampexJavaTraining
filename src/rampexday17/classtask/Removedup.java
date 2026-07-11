package rampexday17.classtask;

import java.util.Arrays;
import java.util.HashSet;
    public class Removedup {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 4};
            removeDup(arr);
            System.out.println(Arrays.toString(arr));
        }

        public static void removeDup(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            System.out.println(set);
        }
    }

