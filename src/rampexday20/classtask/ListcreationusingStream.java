package rampexday20.classtask;

import java.util.stream.Stream;

public class ListcreationusingStream {
    public static void main(String[] args){
        Stream.iterate(0,n->n+2).limit(10).forEach(n->System.out.println(n));
    }
}
