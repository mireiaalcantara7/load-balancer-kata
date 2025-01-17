package load.balancer.kata.application;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double withdraw(double amount) {
        if (balance - amount <= 0) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
        return balance;
    }

    public double add(double amount) {
        balance = balance + amount;
        return balance;
    }
}
