package load.balancer.kata.application;

public interface IAccount {
    void transferMoney(Account origin, Account target, Double amount);
}
