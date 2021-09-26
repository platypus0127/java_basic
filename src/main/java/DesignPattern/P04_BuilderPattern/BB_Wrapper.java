package DesignPattern.P04_BuilderPattern;

public class BB_Wrapper implements AA_Packing {
    @Override
    public String pack() {
        System.out.println("开始打包汉堡");
        return "Wrapper";
    }
}
