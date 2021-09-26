package DesignPattern.P04_BuilderPattern;

public class BB_Bottle implements AA_Packing {
    @Override
    public String pack() {
        System.out.println("开始装可乐");
        return "Bottle";
    }
}
