package com.decorator.impl;

import com.decorator.DataSource;

public class FileDataSource implements DataSource {

    private String fileName;
    private String data;

    public FileDataSource(String fileName) {
        System.out.println("Lendo os dados do arquivo: " + fileName);
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Escreve a data no arquivo: " + data);
        this.data = data;
    }

    @Override
    public String readData() {
        System.out.println("Lê o arquivo, retorna o valor.");
        return data;
    }
}
