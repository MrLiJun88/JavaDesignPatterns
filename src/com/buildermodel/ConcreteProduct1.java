package com.buildermodel;

public class ConcreteProduct1 extends AbstractBuilder{
    @Override
    public void buildBasic() {
        System.out.println("商品房打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("商品房砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("商品房封顶");
    }
}
