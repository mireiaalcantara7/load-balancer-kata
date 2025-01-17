package load.balancer.kata.application;

public class AccountService implements IAccount {


    public AccountService() {
    }

    @Override
    public void transferMoney(Account origin, Account target, Double amount) {
        try {
            target.add(amount);
            origin.withdraw(amount);
        } catch (IllegalStateException e) {
            target.withdraw(amount);
        }
    }
}
