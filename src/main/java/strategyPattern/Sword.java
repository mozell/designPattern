package strategyPattern;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Sword.attack");
    }
}
