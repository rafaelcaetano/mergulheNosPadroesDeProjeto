package com.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        var treeType = TreeFactory.getTreeType(name, color, texture);
        var tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    public void draw(String canvas) {
        for (var tree: this.treeList) {
            tree.draw(canvas);
        }
    }


}
