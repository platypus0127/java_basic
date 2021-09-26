package DesignPattern.P10_DecoratorPattern;
// 构建实体：也是被装饰的类
//2、定义具体的被装饰者，这里是煎饼果子，当然还可以有鸡蛋灌饼、手抓饼等其他被装饰者
// 具体构件，或者基础构件,是最核心、最原始、最基本的接口或抽象类Component的实现，可以单独用，也可将其进行装饰，。
public class Pancake_BB_Battercake extends Pancake_AA_Pancake {
    @Override
    public double cost() {
        return 8;
    }

    public Pancake_BB_Battercake(){
        description = "煎饼果子";
    };
}
