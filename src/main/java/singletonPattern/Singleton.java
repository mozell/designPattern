package singletonPattern;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Singleton.Singleton create");
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
