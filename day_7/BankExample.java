package day_7;

//Implement a BankAccount class accessed by multiple threads to deposit and withdraw money. Use synchronization.

class BankAccount {
    private int balance = 100;

    synchronized void deposit(int amount) {
        balance += amount;
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) balance -= amount;
    }

    int getBalance() { return balance; }
}

public class BankExample {
    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount();
        Runnable task = () -> { acc.deposit(50); acc.withdraw(30); };
        Thread t1 = new Thread(task), t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Balance: " + acc.getBalance());
    }
}


//Balance: 140
