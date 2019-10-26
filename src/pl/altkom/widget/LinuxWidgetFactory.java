package pl.altkom.widget;

public class LinuxWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }

    private static class LinuxWindow extends Window {

    }

    private static class LinuxButton implements Button {
        @Override
        public void click() {
            System.out.println("Klikam w przycisk pod linuksem");
        }

        @Override
        public void render() {

        }
    }

    private static class LinuxLabel implements Label {

        @Override
        public String getText() {
            return "Linux label";
        }

        @Override
        public void render() {

        }
    }
}
