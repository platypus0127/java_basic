package DesignPattern.P01_FactoryPattern;

public class Rectangle implements  Shape{
    @Override
    public void draw() {
        System.out.println("画矩形：Inside Rectangle::draw() method.");
    }
}
