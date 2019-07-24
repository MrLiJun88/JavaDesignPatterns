package com.buildermodel;

public class ConcreteProduct2 extends AbstractBuilder {
    @Override
    public void buildBasic() {
        System.out.println("别墅打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("别墅砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("别墅封顶");
    }
}
