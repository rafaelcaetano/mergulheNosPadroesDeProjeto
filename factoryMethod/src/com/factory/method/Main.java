package com.factory.method;

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
