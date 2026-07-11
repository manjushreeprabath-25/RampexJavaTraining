package rampexday17.classtask;

import java.util.Arrays;
import java.util.HashSet;
public class RemovingDuplicatesusingSet {
    public static void main(String[] args) {
        int [] arr ={1,2,3,2,4,3,1};
        HashSet<Integer> hs =new HashSet<>();
        for(Integer i : arr){
            hs.add(i);
        }
        int [] nums = new int[hs.size()];
        int index =0;
        for (Integer i : hs){
            nums[index++]=i;
        }
        System.out.println(Arrays.toString(nums));
    }
}
