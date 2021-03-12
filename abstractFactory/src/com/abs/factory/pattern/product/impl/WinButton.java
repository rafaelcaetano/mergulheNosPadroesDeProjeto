package com.abs.factory.pattern.product.impl;

import com.abs.factory.pattern.product.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Renderiza um botao no estilo windows.");
    }
}
