package templateMethodPattern.army;

import templateMethodPattern.Citizen;
import templateMethodPattern.army.armor.Armor;
import templateMethodPattern.army.weapon.Weapon;

public class Soldier extends Citizen {

    private Weapon weapon;
    private Armor armor;

    public void attack() {
        if (weapon == null) {
            System.out.println("Soldier.attack");
        }
        weapon.attack();
    }

    public void defense() {
        if (armor == null) {
            System.out.println("Soldier.defense");
        }
        armor.defense();
    }

    public Soldier() {
        super();
    }

    public Soldier(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public Soldier(Citizen citizen) {
        super(citizen);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
