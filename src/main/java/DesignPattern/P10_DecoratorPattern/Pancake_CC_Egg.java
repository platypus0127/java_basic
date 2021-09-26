package DesignPattern.P10_DecoratorPattern;

//装饰器实体类
public class Pancake_CC_Egg extends Pancake_BB_CondimentDecorator {
    public  Pancake_CC_Egg(Pancake_AA_Pancake pancake_aa_pancake){
        super(pancake_aa_pancake);
    }

    @Override
    public String getDescription() {
        return pancake_aa_pancake.getDescription() + "加鸡蛋";
    }

    @Override
    public double cost() {
        return pancake_aa_pancake.cost() +2;
    }
}
