package DesignPattern.P10_DecoratorPattern;


import java.io.FilterInputStream;

/*
*
* https://www.javazhiyin.com/75816.html
* 装饰设计模式： 煎饼例子
*  模式动机：一般有两种方式可以实现给一个类或对象增加行为：
*继承机制，使用继承机制是给现有类添加功能的一种有效途径，通过继承一个现有类可以使得子类在拥有自身方法的同时还拥有父类的方法。
* 但是这种方法是静态的，用户不能控制增加行为的方式和时机。
关联机制，即将一个类的对象嵌入另一个对象中，由另一个对象来决定是否调用嵌入对象的行为以便扩展自己的行为，我们称这个嵌入的对象为装饰器(Decorator)
* */
public class Pancake_ZZ_test {

    public static void main(String[] args) {
        System.out.println("==============只要煎饼===================");
        Pancake_AA_Pancake pancake_aa_pancake = new Pancake_BB_Battercake();
        System.out.println(pancake_aa_pancake.getDescription()+"花费" + pancake_aa_pancake.cost());

        System.out.println("==============煎饼加双蛋===================");
        Pancake_AA_Pancake pancake_bb_battercake = new Pancake_BB_Battercake();
        pancake_bb_battercake = new Pancake_CC_Egg(pancake_bb_battercake);
        System.out.println(pancake_bb_battercake.getDescription()+ "花费" + pancake_bb_battercake.cost() + "元");
        pancake_bb_battercake = new Pancake_CC_Egg(pancake_bb_battercake);
        System.out.println(pancake_bb_battercake.getDescription()+ "花费" + pancake_bb_battercake.cost() + "元");

        System.out.println("==============煎饼加蛋加火腿肠===================");
        Pancake_AA_Pancake sausage_Battercake1 = new Pancake_BB_Battercake();
        sausage_Battercake1 = new Pancake_CC_Egg(sausage_Battercake1);
        sausage_Battercake1 = new Pancake_CC_Sausage(sausage_Battercake1);
        System.out.println(sausage_Battercake1.getDescription() + "花费" + sausage_Battercake1.cost() + "元");



    }
}
