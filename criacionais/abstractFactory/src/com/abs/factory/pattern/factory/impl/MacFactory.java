package com.abs.factory.pattern.factory.impl;

import com.abs.factory.pattern.factory.GUIFactory;
import com.abs.factory.pattern.product.Button;
import com.abs.factory.pattern.product.Checkbox;
import com.abs.factory.pattern.product.impl.MacButton;
import com.abs.factory.pattern.product.impl.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
