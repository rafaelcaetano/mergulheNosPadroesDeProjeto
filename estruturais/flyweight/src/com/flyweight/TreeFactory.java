package com.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class TreeFactory {
    private static List<TreeType> treeTypeList = new ArrayList<>();

    private static Predicate<TreeType> filterTree(String name, String color, String texture) {
        return treeType -> treeType.getName().equals(name) && treeType.getColor().equals(color) && treeType.getTexture().equals(texture);
    }

    public static TreeType getTreeType(String name, String color, String texture){
        Optional<TreeType> treeTypeOptional = treeTypeList.stream().filter(filterTree(name, color, texture)).findFirst();
        if (treeTypeOptional.isEmpty()) {
            System.out.println("Inserindo nome, cor e textura no cache.");
            TreeType treeType = new TreeType(name, color, texture);
            treeTypeList.add(treeType);
            System.out.println("Tamanho do cache: " + treeTypeList.size());
            return treeType;
        } else {
            System.out.println("Usando valor do cache");
            System.out.println("Tamanho do cache: " + treeTypeList.size());
        }
        return treeTypeOptional.get();
    }

}
