package com.singleton;

public class Database {

    private static Database instance;
    private static int count;

    private Database() {
        count ++;
        System.out.println("Conecta com um servidor de banco de dados;");
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            System.out.println("Lock na thread..");
            if (Database.instance == null) {
                System.out.println("Se neste tempo nenhuma outra thread criou a instancia, entao cria...");
                Database.instance = new Database();
            } else {
                System.out.println("Alguma thread criou a instancia neste meio tempo.. Usar a ja existente..");
            }
        } else {
            System.out.println("Istancia já criada, usar a ja existente..");
        }
        return Database.instance;
    }

    public String query(String sql) {
        System.out.println(sql);
        return sql;
    }

    public int getCount() {
        return count;
    }
}
