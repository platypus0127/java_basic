package DesignPattern.P04_BuilderPattern;


/**
 * 建造者模式
 */
public abstract class  House_AA_Builder {
    //地基
    abstract void buildA();

    //钢筋工程
    abstract void buildB();

    //铺电线
    abstract void buildC();

    //粉刷
    abstract  void buildD();

    //完工-获取产品
    abstract House_AA_Product gteHouse_AA_Product();
}
