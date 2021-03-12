package com.abs.factory.pattern.factory.impl;

import com.abs.factory.pattern.factory.GUIFactory;
import com.abs.factory.pattern.product.Button;
import com.abs.factory.pattern.product.Checkbox;
import com.abs.factory.pattern.product.impl.WinButton;
import com.abs.factory.pattern.product.impl.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
