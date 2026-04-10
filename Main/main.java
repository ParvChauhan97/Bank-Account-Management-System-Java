import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService BS = new BankService();

        while(true) {
            System.out.println("1 :- Create Account");
              System.out.println("2 :- deposit");
               System.out.println("3 :- withdraw");
                System.out.println("4 :- Transfer Money");
                 System.out.println("5 :- display");
                System.out.println("6 :- All Accounts");
               System.out.println("7 :- Exit");
              System.out.print("Select Your Option: ");
            int a = sc.nextInt();

            switch (a) {
                case 1: {
                    //Create New Bank Account....
                      System.out.print("Enter your Account Number:- ");
                        long accountNumber = sc.nextLong();
                           System.out.print("Enter your Name:- ");
                             String name = sc.next();
                           System.out.println();
                        //Calling from bank Services Class.
                     BS.createAccount(accountNumber, name);
                    break;  }

                case 2: {
                    //Deposit Money Using Account Number.
                       System.out.print("Enter Your Account Number:- ");
                          long accountNumber = sc.nextLong();
                         BS.deposit(accountNumber);
                    break;  }

                case 3: {
                    //Withdraw Money Using Account Number.
                       System.out.print("Enter Your Account Number:- ");
                          long accountNumber = sc.nextLong();
                       BS.withdraw(accountNumber);
                    System.out.println("Withdraw Successful" +"\n");
                    break;  }

                case 4: {
                    System.out.print("Enter Your BankAccount Number:- ");
                       long sander = sc.nextLong();
                           System.out.print("Enter Receiver BankAccount Number:- ");
                         long receiver = sc.nextLong();
                      BS.transfer(sander, receiver);
                    break;
                }

                case 5: {
                    //display Account Information Using Account Number.
                       System.out.print("Enter Your Account Number:- ");
                          long accountNumber = sc.nextLong();
                        BS.display(accountNumber);
                    break;  }

                case 6:
                    //Display All Registered Account Number of Bank.
                       BS.displayAll();
                           System.out.println();
                      break;

                case 7:  return;
                default: System.out.println("Invalid Number, Please Enter Valid Number.");
            }
        }
    }
}
