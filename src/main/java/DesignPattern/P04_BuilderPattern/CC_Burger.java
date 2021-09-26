package DesignPattern.P04_BuilderPattern;

public abstract class CC_Burger implements AA_Item {
    @Override
    public AA_Packing packing() {
        return new BB_Wrapper();
    }

    @Override
    public float price() {
        return 0;
    }
}
