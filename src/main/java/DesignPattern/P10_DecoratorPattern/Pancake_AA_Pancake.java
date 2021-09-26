package DesignPattern.P10_DecoratorPattern;


//定义抽象组件
public abstract class Pancake_AA_Pancake {
    String description = "普通煎饼";

    public String getDescription() {
        return description;
    }

     public abstract double cost();
}
