package com.decorator.impl;

import com.decorator.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Encripta do dado");
        data = data + "Encrypt";
        System.out.println("Passa o dado encriptografado para o metodo do objeto envolvido: " + data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Le o dado do metodo do objeto envolvido: ");
        String data =  super.readData();
        System.out.print(data + "\n");
        System.out.println("Descriptografa e retorna no objeto pronto");
        return data.replace("Encrypt", "");
    }

}
