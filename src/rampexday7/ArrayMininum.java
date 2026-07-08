package rampexday7;

public class ArrayMininum {
        public static void main(String[]args){
            int[]arr={1,2,3,5,4};

            int min=arr[0] ;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
}
            System.out.println("Minimum value:"+min);


        }
}