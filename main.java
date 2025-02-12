import createrAgent.CreaterAgent;
import createBarbarian.createBarbarian;
import createArcher.createArcher;
public class main {
    public static void main(String[] args) {
        CreaterAgent brb = new createBarbarian();
        brb.spawnAgent();
        brb.attackAgent();
        CreaterAgent archer = new createArcher();
        archer.spawnAgent();
        archer.attackAgent();
    }
}
