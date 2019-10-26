package pl.altkom.widget;

public class Client {
    public static void main(String[] args) {
        WidgetFactory factory;

        Window w = factory.createWindow();
        w.addButton(factory.createButton());
        w.addButton(factory.createButton());
        w.addLable(factory.createLabel());


    }
}
