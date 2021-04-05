package com.decorator.impl;

import com.decorator.DataSource;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compacta o dado");
        data = data + "Compressed";
        System.out.println("Passa o dado compactado para o metodo do objeto envolvido: " + data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Le o dado do metodo do objeto envolvido: ");
        String data =  super.readData();
        System.out.print(data + "\n");
        System.out.println("Descriptografa e retorna no objeto pronto");
        return data.replace("Compressed", "");
    }

}
