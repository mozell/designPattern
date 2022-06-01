package decoratorPattern;

import decoratorPattern.decorator.Display;
import decoratorPattern.decorator.FullBorder;
import decoratorPattern.decorator.SideBorder;
import decoratorPattern.decorator.StringDisplay;

public class main {
    public static void main(String[] args) {
        StringDisplay b1 = new StringDisplay("Hello, world");
        SideBorder b2 = new SideBorder(b1, '#');
        FullBorder b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello, everyone!")
                                        ), '*')
                        )
                ), '/');
        b4.show();
    }
}
