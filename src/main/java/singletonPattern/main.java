package singletonPattern;

public class main {
    public static void main(String[] args) {
        System.out.println("main start");

        Singleton instance1 = Singleton.getSingleton();
        Singleton instance2 = Singleton.getSingleton();

        System.out.println("instance1과 instance2의 동일성 비교 = " + (instance1 == instance2));
        System.out.println("main end--");
    }
}
