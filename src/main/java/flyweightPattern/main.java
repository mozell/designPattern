package flyweightPattern;

import flyweightPattern.flyweight.Flyweight;
import flyweightPattern.flyweight.Square;

public class main {
    public static void main(String[] args) {

        Square redSquare1 = Flyweight.getSquare("RED");
        Square redSquare2 = Flyweight.getSquare("RED");
        Square blueSquare1 = Flyweight.getSquare("BLUE");

        System.out.println("redSquare1 = " + redSquare1.toString());
        System.out.println("redSquare2 = " + redSquare2.toString());
        System.out.println("blueSquare1 = " + blueSquare1.toString());
    }
}

// thx to https://mantaray.tistory.com/80