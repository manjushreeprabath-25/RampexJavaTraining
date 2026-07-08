package rampexday8.classtask;

import java.util.Arrays;
public class Arraytwopointer {


     public static void main(String [] s){


          int[]  nums ={1,2,3,6,5,4};

          int n =nums.length;


          int left =0;
          int right =n-1;
          int temp ;








          for(int i=0;i<nums.length;i++){

               temp = nums[left];
               nums[left] = nums[right];
               nums[right] = temp;


               left++;
               right--;

          }
          System.out.println(Arrays.toString(nums));



     }






}