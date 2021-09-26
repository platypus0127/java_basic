package DesignPattern.P04_BuilderPattern;

public abstract  class CC_ColdDrink implements  AA_Item {
    @Override
    public AA_Packing packing() {
        return new BB_Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
