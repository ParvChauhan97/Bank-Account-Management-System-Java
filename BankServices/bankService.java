import java.util.HashMap;
import java.util.Scanner;

public class BankService {
    Scanner sc = new Scanner(System.in);
    HashMap<Long, BankAccount> map = new HashMap<>();

    public void createAccount(long accountNumber, String name) {
        if(!map.containsKey(accountNumber)) {
              map.put(accountNumber, new BankAccount(accountNumber, name, 0.0));
                   System.out.println("Account Created SuccessFull." +"\n");
               } else System.out.println("Account Number Already exist, " +
            "please create account with different account number.." + "\n");
    }

    public void deposit(long accountNumber) {
        if (map.containsKey(accountNumber)) {
               BankAccount acc = map.get(accountNumber);
                 System.out.print("Enter amount to deposit in your account:- ");
                   double amount = sc.nextDouble();
             acc.deposit(amount);
         } else System.out.println("Bank Account not found, Please Create Your Bank Account.");
    }

    public void withdraw(long accountNumber) {
        if (map.containsKey(accountNumber)) {
            BankAccount acc = map.get(accountNumber);
                System.out.print("Enter Withdraw Amount:- ");
                    double amount = sc.nextDouble();
                acc.withdraw(amount);
          } else System.out.println("Bank Account not found, Please Create Your Bank Account.");
        System.out.println();
    }

    void transfer(long sender, long receiver) {
        if(map.containsKey(sender)) {
            if(map.containsKey(receiver)) {
                System.out.println("Enter amount to Transfer:- ");
                   double amount = sc.nextDouble();
                     BankAccount s = map.get(sender);
                        BankAccount r = map.get(receiver);
                          if(amount <= s.balance) {
                             s.withdraw(amount);
                             r.deposit(amount);
                          System.out.println("Transaction Successful" +"\n");
                      }
                  else System.out.println("Insufficient Balance..." +"\n");
               }
            else System.out.println("Receiver Account not found, please Enter Valid Receiver AccountNumber...." +"\n");
           }
        else System.out.println("Your Account not found, please Enter Valid AccountNumber...." +"\n");
    }

    public void display(long accountNumber) {
        if (map.containsKey(accountNumber)) {
           BankAccount acc = map.get(accountNumber);
              acc.display();
           } else System.out.println("Bank Account not found, Please Create Your Bank Account..");
        System.out.println();
    }

    void displayAll() {
        for(long ele : map.keySet()) System.out.println(ele);
    }
}
