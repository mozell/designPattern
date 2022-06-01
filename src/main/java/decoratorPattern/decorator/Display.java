package decoratorPattern.decorator;

public abstract class Display {
    // 가로 문자수를 얻는다.
    public abstract int getColumns();

    // 세로 행수를 얻는다.
    public abstract int getRows();

    // row번째의 문자열을 얻는다.
    public  abstract String getRowText(int row);

    // 전부 출력하기.
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
