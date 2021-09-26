package DesignPattern.P10_DecoratorPattern;

// 装饰器
//3、抽象的装饰器对象，定义一个调料抽象类
// 装饰角色,一般是一个抽象类，继承自或实现Component，在它的属性里面有一个变量指向Component抽象构件，我觉得这是装饰器最关键的地方。
public abstract  class Pancake_BB_CondimentDecorator extends Pancake_AA_Pancake {
    // 持有组件对象
    protected  Pancake_AA_Pancake pancake_aa_pancake;

    public Pancake_BB_CondimentDecorator(Pancake_AA_Pancake pancake_aa_pancake){
        this.pancake_aa_pancake = pancake_aa_pancake;
    }

    @Override
    public abstract  String getDescription();

}
