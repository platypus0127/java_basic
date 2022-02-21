package DesignPattern.P12_FlyweightPattern;


/*
*
* 参考: https://www.javazhiyin.com/84752.html
* */
public class Web_BB_ConcreteWebSite extends  Web_AA_WebSite {
    // 网站发布形式
    private String name = "";

    public Web_BB_ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    public void use(Web_AA_User user) {

        System.out.println("【当前网站分类】：" + name + "【客户】" + user.getName()
        );
    }
}
