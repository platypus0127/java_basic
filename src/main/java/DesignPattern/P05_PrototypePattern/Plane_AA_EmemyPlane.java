package DesignPattern.P05_PrototypePattern;

/*
*
* 打飞机游戏：两类飞机（主机飞机、敌机），其中敌机有多台，大量的重复创造敌机会消耗很多资源，那怎么避免重复创造敌机那？
* 答案：通过克隆的方式？
* */
public class Plane_AA_EmemyPlane  implements Cloneable{  //实现克隆接口

    private int x; //敌机横坐标
    private int y = 0; //敌机纵坐标

    public  Plane_AA_EmemyPlane(int x){
        System.out.println("创造了一架敌机");
         this.x=x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void fly(){//让敌机飞
        y++;////每调用一次，敌机飞行时纵坐标＋1
    }

    public void setX(int x ){
        this.x = x;
    }

    //为了保证飞机飞行的连贯性
    //这里我们关闭setY方法，不支持随意更改Y纵坐标
        //    public void setY(int y) {
        //        this.y = y;
        //    }

    //重写克隆方法  重写我们调用了父类Object的克隆方法，这里JVM会进行内存操作直接拷贝原始数据流，简单粗暴，不会有其他更多的复杂操作（类加载，实例化，初始化等等），
    // 速度远远快于实例化操作。OK，我们看怎么克隆这些敌机，做一个造飞机的工厂吧。
    @Override
    protected Plane_AA_EmemyPlane clone() throws CloneNotSupportedException {
        return  (Plane_AA_EmemyPlane)super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("敌机坐标X:%s",this.x ) + String.format("==y:%s", this.y) ;
    }
}


