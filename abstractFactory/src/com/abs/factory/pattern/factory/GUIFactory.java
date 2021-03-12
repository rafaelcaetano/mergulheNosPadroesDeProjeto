package com.abs.factory.pattern.factory;

import com.abs.factory.pattern.product.Button;
import com.abs.factory.pattern.product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
