package DesignPattern.P12_FlyweightPattern;

import java.util.Hashtable;
import java.util.Random;

public class Chessman_ChessmanFactory {
    // 单例模式工厂
    private static Chessman_ChessmanFactory chessmanChessmanFactory = new Chessman_ChessmanFactory();
    // 缓存存放共享对象
    private final Hashtable<Character, Chessman_AbstractChessman> cache = new Hashtable<>();
    // 私有化构造方法
    private Chessman_ChessmanFactory() {
    }

    // 获得单例工厂
    public static Chessman_ChessmanFactory getInstance() {
        return chessmanChessmanFactory;
    }


    /**
     * 根据字符获得棋子
     *
     * @param c （B：黑棋 W：白棋）
     * @return
     */
    public Chessman_AbstractChessman getChessmanObject(char c){
        // 从缓存中获得棋子对象实例
        Chessman_AbstractChessman chessmanAbstractChessman = this.cache.get(c);

        if(chessmanAbstractChessman == null ) {
            // 缓存中没有棋子对象实例信息 则创建棋子对象实例 并放入缓存
            switch (c) {
                case 'B':
                    chessmanAbstractChessman = new Chessman_BlackChessmanChessman();
                    break;
                case 'W':
                    chessmanAbstractChessman = new Chessman_WhiteChessmanChessman();
                    break;
                default:
                    break;
            }
            // 为防止 非法字符的进入 返回null
            if (chessmanAbstractChessman != null) {
                // 放入缓存
                this.cache.put(c, chessmanAbstractChessman);
            }

        }
        // 如果缓存中存在 棋子对象则直接返回
        return chessmanAbstractChessman;
    }


    //测试类
    public static void main(String[] args){
        // 创建五子棋工厂
        Chessman_ChessmanFactory fiveChessmanChessmanFactory = Chessman_ChessmanFactory.getInstance();
        Random random = new Random();
        int radom = 0;
        Chessman_AbstractChessman chessmanAbstractChessman = null;
        // 随机获得棋子
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(2);
            switch (radom) {
                // 获得黑棋
                case 0:
                    chessmanAbstractChessman = fiveChessmanChessmanFactory.getChessmanObject('B');
                    break;
                // 获得白棋
                case 1:
                    chessmanAbstractChessman = fiveChessmanChessmanFactory.getChessmanObject('W');
                    break;
            }
            if (chessmanAbstractChessman != null) {
                chessmanAbstractChessman.point(i, random.nextInt(15));
            }
        }



    }

}
