package com.factory.method;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }
}
