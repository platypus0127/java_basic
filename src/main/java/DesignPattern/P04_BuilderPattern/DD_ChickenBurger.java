package DesignPattern.P04_BuilderPattern;

public class DD_ChickenBurger extends CC_Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
