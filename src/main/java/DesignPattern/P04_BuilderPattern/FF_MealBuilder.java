package DesignPattern.P04_BuilderPattern;

//创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
public class FF_MealBuilder {
    public EE_Meal prepareVegMeal(){
        EE_Meal meal = new EE_Meal();
        meal.addItem((new DD_VegBurger()));
        meal.addItem(new DD_Coke());
        return meal;

    }

    public EE_Meal prepareNonVerMeal(){
        EE_Meal meal = new EE_Meal();
        meal.addItem(new DD_ChickenBurger());
        meal.addItem(new DD_Pepsi());
        return meal;
    }
}
