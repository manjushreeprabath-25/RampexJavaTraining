package rampexday13.classtask;


public class Pangram {
    public static void main(String[] args) {

        System.out.println(isPangram("The brown fox quickly jumps over The lazy dog"
        ));
    }
    public static boolean isPangram(String s){
        // change the string the lowerCase
        // check whether a-z Exists in the sentence
        //using .contains() method

        s= s.toLowerCase();


        String [] al ={"a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z"};

        for(int i=0;i<=25;i++) {

            if ( s.contains(al[i] )==false){

                return false;
            }
        }
        return true;
    } }
