package Archer;
import factorymethod.FactoryMethod;
public class Archer implements FactoryMethod {
    public void spawn() {
        System.out.println("Archer spawned");
    }
    public void attack(){
        System.out.println("Archer attacking");
    }
}
