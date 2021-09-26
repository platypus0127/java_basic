package DesignPattern.P04_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

//创建一个 Meal 类，带有上面定义的 Item 对象， 我理解为食物条码
public class EE_Meal {
    private List<AA_Item> items = new ArrayList<AA_Item>();

    public void addItem(AA_Item item){
        items.add(item);
    }

    public  float getCost(){
        float cost=0.0f;
        for(AA_Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (AA_Item item : items){
            System.out.println("item:"+ item.name());
            System.out.println(",Packing:" + item.packing().pack());
            System.out.println("price:"+ item.price());
            System.out.println("===下一件商品");
        }
    }
}
