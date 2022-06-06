package mementoPattern;

import mementoPattern.memento.Gamer;
import mementoPattern.memento.Memento;

public class main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("=== " + i);
            System.out.println("현상 : " + gamer);

            gamer.bet();
            System.out.println("소지금 : " + gamer.getMoney() + "원이 되었습니다.");

            //Memento의 취급 결정
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("(많이 증가했으므로 현재의 상태를 저장합니다.)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("(많이 감소했으므로 이전의 상태로 복원합니다.)");
                gamer.restoreMemento(memento);
            }
        }
    }
}
