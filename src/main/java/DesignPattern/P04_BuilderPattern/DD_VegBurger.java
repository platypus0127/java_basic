package DesignPattern.P04_BuilderPattern;

//步骤 4
//创建扩展了 Burger 和 ColdDrink 的实体类。
public class DD_VegBurger extends CC_Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
