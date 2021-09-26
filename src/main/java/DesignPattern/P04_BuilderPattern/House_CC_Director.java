package DesignPattern.P04_BuilderPattern;

/**
 * 指挥者
 */
public class House_CC_Director {
    //指挥工人按顺序建造
    public House_AA_Product create(House_AA_Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.gteHouse_AA_Product();
    }
}
