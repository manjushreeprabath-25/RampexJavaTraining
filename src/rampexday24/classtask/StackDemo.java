package rampexday24.classtask;



public class StackDemo {


    public static void main(String[] args) {



        StackA s1 = new StackA();
//
        s1.display();

        s1.push(4);
        s1.push(2);
        s1.push(3);
        s1.push(1);
        s1.push(9);
        s1.push(5);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());






//        s1.pop();
//
//        s1.isEmpty();
//        s1.size();
    }


}
class StackA {

    int[] st;
    int size;
    int tos;
    int capacity = 5;

    StackA() {

        st = new int[capacity];
        size = 0;
        tos = -1;

        System.out.println("stack object created");
    }


//push method


    public void push(int val) {

        if (tos < capacity - 1) {

            tos++;
            st[tos] = val;
        } else {
            System.out.println("stack is full ");

        }


    }

// pop method


    public int pop(){

        if(isEmpty()==true){

            System.out.println("stack is empty");
            return -1;
        }
        else{
            return st[tos--];
        }

    }


    // display

    public void display() {

        for (int i = 0; i <= tos; i++) {


            System.out.print(st[i] + " ");
        }

    }


    public boolean isEmpty() {

        return tos == -1;
    }

}