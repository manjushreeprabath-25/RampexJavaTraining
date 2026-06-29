package rampexday8.classtask;

import java.util.Arrays;

public class Arrayzerorightshift {

    public static void main(String[] args){
          int[]arr={2,0,3,0,5};
          int[]num=new int[arr.length];
          int pos =0;
          for(int i=0;i<arr.length;i++){
              if(arr[i]!=0){

                  num[pos]=arr[i];
                  pos=pos+1;
              }
          }
          System.out.print(Arrays.toString(num));
    }
}
