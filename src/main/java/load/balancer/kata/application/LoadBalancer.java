package load.balancer.kata.application;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {

    private static final int MAX_SERVERS = 10;
    private final List<String> servers;
    private int roundRobinCounter = 0;

    public LoadBalancer() {
        servers = new ArrayList<>();
    }

    public List<String> getServers() {
        return servers;
    }

    public void createServer(String server) {
        if (!servers.contains(server) && servers.size() < MAX_SERVERS) {
            servers.add(server);
        }
    }

    public String randomServer() {
        int randomNum = (int) Math.floor(Math.random() * servers.size());
        return servers.get(randomNum);
    }

    public String roundRobinServer() {
        if (servers.isEmpty()) return null;
        if (roundRobinCounter <= servers.size() - 1) {
            roundRobinCounter++;
            return servers.get(roundRobinCounter-1);
        }
        roundRobinCounter = 1;
        return servers.get(0);
    }

}
