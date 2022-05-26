package templateMethodPattern.army;

import templateMethodPattern.Citizen;
import templateMethodPattern.army.armor.StellArmor;
import templateMethodPattern.army.weapon.Gun;

public class SoldierConscriptionHelperImpl extends AbstSoldierConscriptionHelper{
    @Override
    protected Citizen conscriptionCitizen() {
        System.out.println("SoldierConscriptionHelperImpl.conscriptionCitizen [징집]");
        return new Citizen();
    }

    @Override
    protected void training(Citizen citizen) {
        citizen.updateStrength(5);
        citizen.updateAgility(4);
        citizen.updatueIntelligence(-3);
        System.out.println("SoldierConscriptionHelperImpl.training [군인 훈련]");
    }

    @Override
    protected Soldier changeOfPosition(Citizen citizen) {
        System.out.println("SoldierConscriptionHelperImpl.changeOfPosition [보직 변경]");
        return new Soldier(citizen);
    }

    @Override
    protected void supplyEquipment(Soldier soldier) {
        soldier.setWeapon(new Gun());
        soldier.setArmor(new StellArmor());
        System.out.println("SoldierConscriptionHelperImpl.supplyEquipment [장비 보급]");
    }
}
