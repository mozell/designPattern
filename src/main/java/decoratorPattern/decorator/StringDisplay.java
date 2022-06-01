package decoratorPattern.decorator;

public class StringDisplay extends Display {

    private final String string; // 표시 문자열

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return (row == 0) ? string : null;
    }

}
