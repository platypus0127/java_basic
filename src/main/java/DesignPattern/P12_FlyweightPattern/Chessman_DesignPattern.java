package DesignPattern.P12_FlyweightPattern;


/*
* java设计模式
* 1:享元模式
* */
public class Chessman_DesignPattern {

    public static void main(String[] args) {
        flyweight();
    }



    /*
    * 享元设计模式 （参考：https://www.cnblogs.com/lixin-link/p/11104658.html）
    * 享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。
    * 该模式的意图为：运用共享技术有效地支持大量细粒度的对象。
    *
    * 单纯享元模式所涉及到的角色如下：
    *   1.1 抽象享元(Flyweight)角色 ：父接口，以规定出所有具体享元角色需要实现的方法。
    *   1.2 具体享元(ConcreteFlyweight)角色：实现抽象享元角色所规定出的接口。
    *   1.3 享元工厂(FlyweightFactory)角色 ：本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有
    * 一个符合要求的享元对象。如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象。
    *
    *
    * 符合享元模式
    * 先来认识两个概念：
      内部状态：在享元对象内部不随外界环境改变而改变的共享部分。
      外部状态：随着环境的改变而改变，不能够共享的状态就是外部状态。
    * */
    public static  void flyweight(){
        Integer i1 = new Integer(50);
        Integer i2 = new Integer(50);
        System.out.println(i1 == i2);

        Integer i3 = new Integer(500);
        Integer i4 = new Integer(500);
        System.out.println(i3 == i4);

        //需要注意下面这种方式存在隐式装箱
        Integer i5 = 50;
        Integer i6 = 50;
        System.out.println(i5 == i6);

        Integer i7 = 500;
        Integer i8 = 500;
        System.out.println(i7 == i8);

    }


}
