package java.Test_3;

public class bankaccount {
    private int accountId;
    private String name;
    private double balance;

    public bankaccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public boolean transfer(bankaccount recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            return true;
        } else {
            System.out.println("Insufficient funds for the transfer.");
            return false;
        }
    }

    public void printReceipt() {
        System.out.println("Account id: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: Rs. " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
  
        bankaccount accountA = new bankaccount(12344, "Account A", 5000);
        bankaccount accountB = new bankaccount(56789, "Account B", 2500);

        if (accountA.transfer(accountB, 1500)) {
            System.out.println("Receipt after transferring 1500 from Account A to B:");
            accountA.printReceipt();
            accountB.printReceipt();
        }

        if (accountB.transfer(accountA, 3000)) {
            System.out.println("Receipt after transferring 3000 from Account B to A:");
            accountA.printReceipt();
            accountB.printReceipt();
        }
    }
}
