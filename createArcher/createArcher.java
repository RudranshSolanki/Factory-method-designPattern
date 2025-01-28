package createArcher;

import createrAgent.CreaterAgent;
import factorymethod.FactoryMethod;
import Archer.Archer;

public class createArcher extends CreaterAgent {
    public FactoryMethod createAgent() {
        return new Archer();
    }
}