package abstractFactoryPattern.listfactory;

import abstractFactoryPattern.factory.Factory;
import abstractFactoryPattern.factory.Link;
import abstractFactoryPattern.factory.Page;
import abstractFactoryPattern.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
