package createBarbarian;

import createrAgent.CreaterAgent;
import factorymethod.FactoryMethod;
import Barbarian.Barbarian;

public class createBarbarian extends CreaterAgent {
    public FactoryMethod createAgent() {
        return new Barbarian();
    }
    
}