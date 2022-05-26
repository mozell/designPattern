package templateMethodPattern;

import templateMethodPattern.army.AbstSoldierConscriptionHelper;
import templateMethodPattern.army.Soldier;
import templateMethodPattern.army.SoldierConscriptionHelperImpl;

public class main {
    public static void main(String[] args) {
        Citizen h1 = new Citizen();
        AbstSoldierConscriptionHelper helper = new SoldierConscriptionHelperImpl();

        Soldier soldier = helper.conscription();

        soldier.attack();
        soldier.defense();
    }
}
