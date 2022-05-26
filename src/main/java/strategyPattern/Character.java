package strategyPattern;

public class Character {
    //접근점 (strategy)
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("Character.attack");
        } else {
            // 위임 (delegate)
            weapon.attack();
        }
    }
}
