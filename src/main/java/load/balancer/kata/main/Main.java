package load.balancer.kata.main;

import load.balancer.kata.application.Account;
import load.balancer.kata.application.AccountService;
import load.balancer.kata.application.LoadBalancer;

public class Main {

    public static void main(String[] args) {

        LoadBalancer loadBalancer = new LoadBalancer();
        loadBalancer.getServers().add("server1");
        System.out.println(loadBalancer.randomServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        loadBalancer.getServers().add("server2");
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        loadBalancer.getServers().add("server3");
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        System.out.println(loadBalancer.roundRobinServer());
        loadBalancer.getServers().add("server4");
        loadBalancer.getServers().add("server5");
        loadBalancer.getServers().add("server6");
        loadBalancer.getServers().add("server7");
        loadBalancer.getServers().add("server8");
        loadBalancer.getServers().add("server9");
        loadBalancer.getServers().add("server10");
        loadBalancer.createServer("server11");
        System.out.println(loadBalancer.getServers().size());
        System.out.println("---------------------");

        Account a = new Account(10);
        Account b = new Account(20);
        AccountService service = new AccountService();
        service.transferMoney(a, b, (double) 5);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        service.transferMoney(a, b, (double) 10);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());

    }
}
