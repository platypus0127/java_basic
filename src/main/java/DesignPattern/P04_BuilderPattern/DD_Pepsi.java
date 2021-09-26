package DesignPattern.P04_BuilderPattern;

public class DD_Pepsi extends CC_ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
