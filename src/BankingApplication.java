import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
    BankAccount obj1 = new BankAccount("Abdullah","187661");
    obj1.showMenu();
    }
}
 class BankAccount{

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount){
    if (amount!=0){
        balance = balance + amount;
        previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if (amount!= 0){

        balance = balance - amount;
        previousTransaction = -(amount);  // THIS MINUS IMPORTANT TO MAKE THE previous() METHOD WORKS
    }
    }
    void getPreviousTransaction(){
        System.out.print("Last Transaction was");
        if (previousTransaction > 0){
            System.out.println(" Deposited: "+ previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println(" Withdraw: "+Math.abs(previousTransaction));

        }
    else {
            System.out.println(" No Transaction Occurred");
        }
     }

     void showMenu() {
         char option = '\0';
         Scanner scanner = new Scanner(System.in);

         System.out.println("*********************************************");
         System.out.println("Welcome " + customerName);
         System.out.println("Your Id is " + customerId);
         System.out.println("*********************************************");
         System.out.println("A. Check Total Balance");
         System.out.println("B. Deposit");
         System.out.println("C. Withdraw");
         System.out.println("D. Previous Transaction");
         System.out.println("E. Exit");

         do {
             System.out.println("*********************************************");
             System.out.println("Enter an option...");
             System.out.println("*********************************************");
             option = scanner.next().charAt(0);

         switch (option) {
             case 'A':
                 System.out.println("*********************************************");
                 System.out.println("Balance = "+balance);
                 System.out.println("*********************************************");
                 break;

             case 'B':
                 System.out.println("*********************************************");
                 System.out.println("Enter an Amount to Deposit");
                 System.out.println("*********************************************");
                 int amount = scanner.nextInt();
                 deposit(amount);
                 break;
             case 'C':
                 System.out.println("*********************************************");
                 System.out.println("Enter an Amount to Withdraw");
                 System.out.println("*********************************************");
                 int amount2 = scanner.nextInt();
                 withdraw(amount2);
                 break;
             case 'D':
                 System.out.println("*********************************************");
                 getPreviousTransaction();
                 System.out.println("*********************************************");
                 break;

             case 'E':
                 System.out.println("*********************************************");
                 break;
             default:
                 System.out.println("Invalid Option, Please enter again...");
         }

         }while (option != 'E');
         System.out.println("Thanks for using our Services");
    }
}

