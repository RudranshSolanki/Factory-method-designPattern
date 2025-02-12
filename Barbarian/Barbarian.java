
package Barbarian;
import factorymethod.FactoryMethod;

public class Barbarian implements FactoryMethod {
    public void spawn() {
        System.out.println("Barbarian spawned");
    }
    public void attack(){
        System.out.println(("Barbarian attacking"));
    }
}