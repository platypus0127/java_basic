package DesignPattern.P01_FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        if(shapeName ==null){
            return null ;
        }

        if("Circle".equals(shapeName)){
            return new Circle();
        }else if("Rectangle".equals(shapeName)){
            return new Rectangle();
        }else{
            System.out.println("这条生产线还没开通，请联系工厂人员");
            return null;
        }
    }
}
