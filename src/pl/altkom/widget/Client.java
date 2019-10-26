package pl.altkom.widget;

public class Client {
    public static void main(String[] args) {
        WidgetFactory factory;
        factory = new LinuxWidgetFactory();
        Window w = factory.createWindow();
        w.addButton(factory.createButton());
        w.addButton(factory.createButton());
        w.addLabel(factory.createLabel());


    }
}
