package com.templatemethodmode;

/**
 * 抽象类，表示豆浆
 */
public abstract class SoyMilk {
    /**make()模版方法，可以定义成final，不允许子类去修改
     * 定义制作的流程，顺序
     * */
    public final void make(){
        this.select();
        if(this.isAdd()){
            this.add();
        }
        this.finish();
        this.sell();
    }
    /**选择添加的配料*/
    abstract void select();

    abstract void add();

    void finish(){
        System.out.println("制作完成");
    }
    void sell(){
        System.out.println("上线出售");
    }
    /**钩子方法，用于有的方法要不要去执行*/
    boolean isAdd(){
        return true;
    }

}
