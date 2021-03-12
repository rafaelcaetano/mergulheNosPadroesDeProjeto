package com.abs.factory;

import com.abs.factory.pattern.factory.GUIFactory;
import com.abs.factory.pattern.product.Button;
import com.abs.factory.pattern.product.Checkbox;

public class Application {

    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
