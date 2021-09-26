package DesignPattern.P04_BuilderPattern;

public class DD_Coke extends CC_ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 10f;
    }
}
