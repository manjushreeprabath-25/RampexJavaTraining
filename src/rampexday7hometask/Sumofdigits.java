package rampexday7hometask;

public class Sumofdigits {
    public static void main(String[] args){
        int num =543;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;


        }
        System.out.print(sum);
    }
}
