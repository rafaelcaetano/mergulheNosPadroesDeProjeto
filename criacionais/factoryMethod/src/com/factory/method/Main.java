package com.factory.method;

import com.factory.method.pattern.impl.Dialog;
import com.factory.method.pattern.impl.WebDialog;
import com.factory.method.pattern.impl.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        initializeHtmlDialog();
        dialog.render();
        initializeWindowsDialog();
        dialog.render();
    }

    private static void initializeHtmlDialog() {
        dialog = new WebDialog();
    }

    private static void initializeWindowsDialog() {
        dialog = new WindowsDialog();
    }

}
