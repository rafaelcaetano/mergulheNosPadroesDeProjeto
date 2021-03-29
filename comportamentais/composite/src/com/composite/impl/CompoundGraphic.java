package com.composite.impl;

import com.composite.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> childrenList;

    public CompoundGraphic() {
        this.childrenList = new ArrayList<>();
    }

    public void add(Graphic children) {
        childrenList.add(children);
    }

    public void add(List<Graphic> childrenList) {
        childrenList.addAll(childrenList);
    }

    public void remove(Graphic children){
        childrenList.remove(children);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic children : childrenList) {
            children.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic children : childrenList) {
            children.draw();
        }
    }

    public List<Graphic> getChildrenList() {
        return childrenList;
    }
}
