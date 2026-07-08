package rampexday15.classtask;



    public class SynchronizedMethods {


        public static void main(String[] args) {


        }

        class GpayAccount extends Thread{

            BankAccount b;

            GpayAccount(BankAccount bankAcc){
                System.out.println(" gpay Account created");
                this .b=bankAcc;
            }


            // this method will take 500 rs from your account
            public void pay(){

                b.withdraw(500);
            }
        }

        class PhonePe extends Thread{
            BankAccount b;

            PhonePe(BankAccount bankAcc){
                this.b =bankAcc;
            }


            public void pay(){

                b.withdraw(300);
            }

        }


        class BankAccount{

            String name ;
            int balance;


            //-------------- withdraw method

            public void withdraw(int amount){

                balance = balance -amount;
            }

        }

    }

