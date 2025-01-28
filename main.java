import createrAgent.CreaterAgent;
import createBarbarian.createBarbarian;
import createArcher.createArcher;
public class main {
    public static void main(String[] args) {
        CreaterAgent agent = new createBarbarian();
        agent.spawnAgent();
        agent = new createArcher();
        agent.spawnAgent();
    }
}
