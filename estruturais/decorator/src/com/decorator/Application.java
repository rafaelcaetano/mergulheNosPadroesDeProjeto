package com.decorator;

import com.decorator.impl.CompressionDecorator;
import com.decorator.impl.EncryptionDecorator;
import com.decorator.impl.FileDataSource;

public class Application {

    private static DataSource source;
    private static String data = "data";

    public static void main(String[] args) {

        source = new FileDataSource("someFile.dat");
        source.writeData(data);
        System.out.println(source.readData());

        System.out.println("==================================================");

        source = new EncryptionDecorator(source);
        source.writeData(data);
        System.out.println(source.readData());

        System.out.println("==================================================");

        source = new CompressionDecorator(source);
        source.writeData(data);
        System.out.println(source.readData());

        System.out.println("==================================================");

    }

}
