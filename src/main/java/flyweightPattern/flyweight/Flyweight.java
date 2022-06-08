package flyweightPattern.flyweight;

import java.util.HashMap;

public class Flyweight {

    private static final HashMap<String, Square> squares = new HashMap<>();

    public static Square getSquare(String color) {
        if (squares.containsKey(color)) {
            return squares.get(color);
        }

        Square square = new Square(color);
        squares.put(color, square);

        return square;
    }
}
