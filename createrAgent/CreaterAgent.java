package createrAgent;

import factorymethod.FactoryMethod;


public abstract class CreaterAgent {
    private FactoryMethod agent;
    public abstract FactoryMethod createAgent();
    
    public void spawnAgent(){
        agent = createAgent();
        agent.spawn();
    }
    public void attackAgent(){
        agent.attack();
    }
    
   
}


