package DesignPattern.P05_PrototypePattern;


/*
* 飞机工厂-克隆飞机
* */
public class Plane_ZZ_EnemyPlaneFactory {


    //此处用痴汉模式造一个敌机原型
    private static Plane_AA_EmemyPlane protoType = new Plane_AA_EmemyPlane(100);

    //获取敌机克隆实例
    public static Plane_AA_EmemyPlane getInstance(int x) throws CloneNotSupportedException {
        Plane_AA_EmemyPlane clone = protoType.clone();
        clone.setX(x);
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Plane_AA_EmemyPlane instance1 = Plane_ZZ_EnemyPlaneFactory.getInstance(100);
        System.out.println("敌机1"+ instance1);

        Plane_AA_EmemyPlane instance2 = Plane_ZZ_EnemyPlaneFactory.getInstance(200);
        System.out.println("敌机2"+ instance2);

        Plane_AA_EmemyPlane instance3 = Plane_ZZ_EnemyPlaneFactory.getInstance(300);
        System.out.println("敌机3"+ instance3);

        Plane_AA_EmemyPlane instance4 = Plane_ZZ_EnemyPlaneFactory.getInstance(400);
        System.out.println("敌机4"+ instance4);

        //敌机1 飞行
        instance1.fly();
        instance1.fly();
        System.out.println("敌机1"+ instance1);

    }


}