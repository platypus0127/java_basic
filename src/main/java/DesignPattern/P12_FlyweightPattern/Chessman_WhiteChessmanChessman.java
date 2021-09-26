package DesignPattern.P12_FlyweightPattern;


//享元模式-白色棋子
public class Chessman_WhiteChessmanChessman extends Chessman_AbstractChessman {

    /**
     * 构造方法 初始化白棋子
     */
    public Chessman_WhiteChessmanChessman() {
        super("○");
        System.out.println("--WhiteChessman Construction Exec!!!");

    }

    // 点坐标设置
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        // 显示棋子内容
        show();
    }
}
