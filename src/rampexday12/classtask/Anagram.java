package rampexday12.classtask;




import java.util.Arrays;
public class Anagram {

    public static void main(String [] args){
        System.out.println(isAnagram("pot" ,"top"));
    }
    public static boolean  isAnagram( String s1,String s2){
        //input 2  String arguments
        //o/p : true or false
        //steps: 1. check and compare the length of
        // both strings
        // 2.if length not same return false ,
        // else check further
        if(s1.length() ==s2.length()){
            char [] arr1 = s1.toCharArray(); //['p','o','t']
            char [] arr2 =s2.toCharArray();  //['t','o','p']
            Arrays.sort(arr1);                     //['o','p','t']
            Arrays.sort(arr2);            //   ['o','p','t']

            if (  arr1.equals(arr2)==true){
                return true;
            }
            else
            {return false;}
        };
        return false;
    }
}
