package flyweightPattern.flyweight;

public class Square implements Shape {

    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color + "네모";
    }
}
