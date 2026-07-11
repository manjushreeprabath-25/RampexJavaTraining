package rampexday18.classtask;

import java.util.ArrayDeque;
import java.util.*;
public class Queue {
    public static void main(String[] args){
        String[] task={"Download","Compile","Test","Deploy"};
        ArrayDeque<String> dq = new ArrayDeque<>();
        for(String t:task){
            dq.add(t);
        }
        for(String t:task){
            System.out.print(t+ "->"+" ");
        }
    }
}
