package com.factory.method.pattern.impl;

import com.factory.method.pattern.Button;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
