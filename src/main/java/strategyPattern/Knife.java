package strategyPattern;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("Knife.attack");
    }
}
