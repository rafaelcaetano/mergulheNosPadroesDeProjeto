package com.flyweight;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y ) {
        System.out.println("Cria um bitmap com um certo tipo, cor e textura.");
        System.out.println("Desenha o bitmap em uma tela nas coordenadas x e y. tela: " + canvas + " x: " + x + " y: " + y);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
