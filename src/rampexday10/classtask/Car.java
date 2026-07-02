package rampexday10.classtask;


class CarTest {

    public static void main(String[] args){

        //here we  will create the car object and test that

        Car c1 = new Car();// first car created
        Car c2 = new Car();
        Car c3 = new Car();

        c1.accelerate();
        c1.accelerate();
        c1.brake();


        c2.brand="audi";
        c2.accelerate();
        c2.accelerate();
        c2.accelerate();

        c2.brake();
        c2.brake();
        c2.brake();
        c2.brake();

    }
}


class Car{
    //blue print for a car

    //variables
    String brand ="bmw";
    String model ="m5";

    int speed =0;

    int maxSpeed=40;


    // methods
    public void accelerate(){
    if(speed==40){
        System.out.print("cars's maximum speed reached ");
    }else {


        speed = speed + 5;
        System.out.println(brand + " car is driving at : " + speed + " km speed");
    }
    }

    public void brake(){

        if(speed ==0){

            System.out.print("vehicle is not moving");

        }
        else{


            speed =speed-5;

            System.out.println( brand +" brake applied  speed : "+ speed +" kms");
        }




    }

}