package DesignPattern.P04_BuilderPattern;


//BuiderPatternDemo 使用 MealBuilder 来演示建造者模式（Builder Pattern）。
public class ZZ_BuiderPatternDemo {
    public static void main(String[] args) {
        FF_MealBuilder mealBuilder = new FF_MealBuilder();

        EE_Meal verMeal = mealBuilder.prepareVegMeal();
        System.out.println("============Veg Meal");
        verMeal.showItems();
        System.out.println("Total cost:" + verMeal.getCost());

        EE_Meal nonVegmeal = mealBuilder.prepareNonVerMeal();
        System.out.println("============nonVegmeal");
        nonVegmeal.showItems();
        System.out.println("Total cost:" + nonVegmeal.getCost());

    }
}
