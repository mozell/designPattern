package facadePattern;

import facadePattern.facade.pagemaker.PageMaker;

public class main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("mozell@test.com", "welcome.html");
    }
}
