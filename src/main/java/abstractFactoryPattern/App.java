package abstractFactoryPattern;

import abstractFactoryPattern.factory.Factory;
import abstractFactoryPattern.factory.Link;
import abstractFactoryPattern.factory.Page;
import abstractFactoryPattern.factory.Tray;

public class App {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("전달된 환경 변수가 존재하지 않습니다.");
            System.out.println("Usage : java Main class.name.of.ConcreteFactory");
            System.out.println("Example : java Main abstractFactoryPattern.listfactory.ListFactory");
        }

        final Factory factory = Factory.getFactory(args[0]);

        Link googleLink = factory.createLink("구글", "http://www.google.co.kr");
        Link naverLink = factory.createLink("네이버", "http://www.naver.com");
        Link netflixLink = factory.createLink("넷플릭스", "http://www.netflix.com");


        final Tray searchTray = factory.createTray("검색 플랫폼");
        searchTray.add(googleLink);
        searchTray.add(naverLink);

        final Tray ottTray = factory.createTray("OTT");
        ottTray.add(netflixLink);


        final Page page = factory.createPage("LinkPage", "테스트 페이지");
        page.add(searchTray);
        page.add(ottTray);

        page.output();
    }
}
