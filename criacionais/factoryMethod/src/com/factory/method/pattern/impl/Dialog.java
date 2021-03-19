package com.factory.method.pattern.impl;

import com.factory.method.pattern.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
}
