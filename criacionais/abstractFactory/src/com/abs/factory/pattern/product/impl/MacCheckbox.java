package com.abs.factory.pattern.product.impl;

import com.abs.factory.pattern.product.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Renderiza uma caixa de selecao no estilo MacOS.");
    }
}
