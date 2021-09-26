package DesignPattern.P04_BuilderPattern;


/**
 * 测试类
 *例子：https://www.jianshu.com/p/47329a94f5dc
 */
public class House_ZZ_BuilderTest {
    public static void main(String[] args) {
        //监工：指挥者
        House_CC_Director house_cc_director = new House_CC_Director();
        House_AA_Product product = house_cc_director.create(new House_BB_ConcreteBuilder());
        System.out.println(product.toString());
    }
}
