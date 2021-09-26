package DesignPattern.P04_BuilderPattern;


/**
 * 具体的建造者：
 * 建造工人
 */

public class House_BB_ConcreteBuilder extends House_AA_Builder {
    private House_AA_Product product;

    public House_BB_ConcreteBuilder() {
        this.product = new House_AA_Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");

    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
    }

    @Override
    House_AA_Product gteHouse_AA_Product() {
        return product;
    }
}
