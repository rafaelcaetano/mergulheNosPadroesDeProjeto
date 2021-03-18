package com.singleton;

public class Main {

    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("select * from customer where id = 1;");
        System.out.println("Contador de instancias: " + foo.getCount());

        Database bar =  Database.getInstance();
        bar.query("update sem where");
        System.out.println("Contador de instancias: " + foo.getCount());

        System.out.println(foo == bar);
    }

}
