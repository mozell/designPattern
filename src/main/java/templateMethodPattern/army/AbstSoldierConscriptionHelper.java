package templateMethodPattern.army;

import templateMethodPattern.Citizen;

public abstract class AbstSoldierConscriptionHelper {
    // 시민들 중 군인이 될 수 있는 조건의 시민을 징집한다.
    protected abstract Citizen conscriptionCitizen();

    // 징집된 군인들을 훈련한다.
    protected abstract void training(Citizen citizen);

    // 보직을 시민에서 군인으로 변경한다.
    protected abstract Soldier changeOfPosition(Citizen citizen);

    // 장비를 보급한다.
    protected abstract void supplyEquipment(Soldier soldier);

    // 시민들을 징집해서 병사로 만든다.
    public Soldier conscription() {
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Soldier soldier = changeOfPosition(citizen);
        supplyEquipment(soldier);
        return soldier;
    }
}
