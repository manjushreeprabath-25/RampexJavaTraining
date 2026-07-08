package rampexday11.classtask;
public class BankingTest {
     public static void main(String[] args){
         Bankaccount b1= new Bankaccount();
         b1.balance = 1000;
         System.out.println(b1.balance);


     }

    static class Bankaccount {


     static  final   String bankName="sbi";
        String accholdername;
        int accno;
        float balance;

        public void deposit(float amount) {
            balance = balance + amount;
            System.out.print("Amount deposited:" + amount + " Rs" + " Balance " + balance);
        }

        public void withdraw(float amount) {
            balance = balance - amount;
        System.out.println(balance);
        }
    }
}