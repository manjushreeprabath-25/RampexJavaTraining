package rampexday14.classtask;


import java.util.Scanner;

public class ParallelArraysToObj {

    public static void main(String[] args) {

        //--------write the menu:

        // let user select the choice.
        //once selected create the object and calculate the bill
        //ask the user Again untill , user press 0->to exit
        System.out.println(" WELCOME !!!");
        System.out.println();
        System.out.println(" Enter 1 for maza ");
        System.out.println(" Enter 2 for sprite ");
        System.out.println(" Enter 3 for pepsi ");
        System.out.println(" Enter 4 for campa");
        System.out.println(" Enter  0 to exit ");

        Scanner sc = new Scanner(System.in);

        int choice;



        float  total =0;
        Drink [] totalItems=  new Drink[100];

        int pos =0;




        //getting the user input

        do {


            System.out.println(" Enter your choice :  ");

            choice = sc.nextInt();



            System.out.println("Enter qty");

            int qty = sc.nextInt();




            if (choice == 1) {

                Maza m = new Maza();

                total = total +qty* m.price;

                totalItems[pos++]=m;
                System.out.println("item" +m.name  + " price is " +m.price);


            } else if (choice == 2) {
                Sprite s = new Sprite();

                total = total + qty*s.price;
                totalItems[pos++]=s;
                System.out.println("item" +s.name  + " price is " +s.price);

            } else if (choice == 3) {

                Pepsi p = new Pepsi();
                total = total + qty* p.price;
                totalItems[pos++]=p;
                System.out.println("item" +p.name  + " price is " +p.price);
            } else if (choice == 4) {

                Campa c = new Campa();
                total = total + qty* c.price;
                totalItems[pos++]=c;

                System.out.println("item" +c.name  + " price is " +c.price);
            }

        }
        while(choice !=0);


        System.out.println("total price is "+ total);









    }




//public void display(Drink d){
//    System.out.println("item" +d.name  + " price is " +d.price);
//}

}
//String [] drinks ={"pepsi", "sprite","maza","mountain dew","campa"};
//
//int [] prices =  {40,20,45,40,10};


class Drink{

    String name;
    float price;
}

class  Maza extends Drink{
    String name="maza";
    float price=20f;

}
class  Sprite extends Drink{
    String name="maza";
    float price=30f;
}
class Pepsi extends Drink{
    String name="pepsi";
    float price=25f;
}
class Campa extends Drink{
    String name="campa";
    float price=10f;
}
