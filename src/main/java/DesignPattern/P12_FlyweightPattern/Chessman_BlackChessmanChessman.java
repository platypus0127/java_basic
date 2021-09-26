package DesignPattern.P12_FlyweightPattern;


// 享元模式， 黑色棋子类
public class Chessman_BlackChessmanChessman extends Chessman_AbstractChessman {


    /**
     * 构造方法 初始化黑棋子
     */
    public Chessman_BlackChessmanChessman() {
        super("●");
        System.out.println("--BlackChessman Construction Exec!!!");
    }

    // 点坐标设置
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y =y;

        //显示棋子内容
        show();
    }
}
