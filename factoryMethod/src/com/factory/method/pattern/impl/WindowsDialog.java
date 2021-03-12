package com.factory.method.pattern.impl;

import com.factory.method.pattern.Button;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
