package pl.altkom.widget;

import java.util.ArrayList;
import java.util.List;

public class Window {
    private List<Widget> widgets;

    public Window() {
        widgets = new ArrayList<>();
    }

    public void addButton(Button b) {
        widgets.add(b);
    }

    public void addLabel(Label l) {
        widgets.add(l);
    }
}
