public class BankAccount {
long accountNumber;
String name;
double balance;

public BankAccount(long accountNumber, String name, double balance) {
    this.accountNumber = accountNumber;
      this.name = name;
    this.balance = balance;
}

void display() {
    System.out.println();
         System.out.println("Your name is: " +name);
      System.out.println("Your Account Number is: " +accountNumber);
    System.out.println("Your Bank Balance is: " +balance);
}

public  void deposit(double amount) {
   balance += amount;
    System.out.println("Deposit Successful");
}

public void withdraw(double amount) {
    if(amount <= balance) {
      balance -= amount;
    } else System.out.println("Insufficient Balance" +"\n");
}
}