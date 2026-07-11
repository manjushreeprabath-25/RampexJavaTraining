package rampexday18.classtask;

import java.util.ArrayDeque;
public class ArrayDequetest {
    public static void main(String[] args){
        ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
        dq.add(5);
        dq.add(6);
        dq.add(3);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.peek());
        System.out.println(dq);
    }
}
