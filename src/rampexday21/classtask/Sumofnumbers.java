package rampexday21.classtask;

public class Sumofnumbers {

    public static void main(String[] args){
        int a=5;
        int b=7;
        add( a, b);
    }
    public static void add(int a,int b){
       int c= a+b;

        System.out.println(c);
        //c++;
        add(a,b);
    }
}

