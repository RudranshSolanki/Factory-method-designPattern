package createrAgent;

import factorymethod.FactoryMethod;


public abstract class CreaterAgent {
    public abstract FactoryMethod createAgent();
    public void spawnAgent(){
        var agent = createAgent();
        agent.spawn();
    }
}


