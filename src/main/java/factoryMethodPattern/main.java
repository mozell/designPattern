package factoryMethodPattern;

import factoryMethodPattern.framework.Factory;
import factoryMethodPattern.framework.Product;
import factoryMethodPattern.idcard.IDCardFactory;

public class main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("길응호");
        Product card2 = factory.create("김태헌");
        card1.use();
        card2.use();
    }
}
