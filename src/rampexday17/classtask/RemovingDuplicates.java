package rampexday17.classtask;

import java.util.ArrayList;
import java.util.Arrays;
public class RemovingDuplicates {
    public static void main(String [] args){
        int [] arr = {1,22,3,4,5,5,6};
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i : arr){
            a.add(i);
        }
        boolean dup = false;
        for(int i = 0;i<a.size();i++){
            for(int j = i+1;j<a.size();j++){
                if(a.get(i).equals(a.get(j))){
                    dup = true;
                    break;
                }
            }
            System.out.println(b);
            if(dup == false){
                b.add(a.get(i));
            }
        }
    }


}
