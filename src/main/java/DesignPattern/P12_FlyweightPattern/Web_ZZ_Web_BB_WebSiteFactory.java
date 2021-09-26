package DesignPattern.P12_FlyweightPattern;


/*
* https://www.javazhiyin.com/84752.html
* 享元模式: 区分内外部状态
* 内部状态：对象共享出来的信息，存储在享元对象内部并且不会随环境改变的共享部分
* 外部状态：对象用来标记的一个内容，随环境会改变，不可共享
* */
public class Web_ZZ_Web_BB_WebSiteFactory {

    public static void main(String[] args) {
        // 创建一个工厂
        Web_BB_WebSiteFactory factory = new Web_BB_WebSiteFactory();

        // 给客户创建一个博客类型的网站
        Web_AA_WebSite webSite1  = factory.getWeb_AA_WebSite("博客");
        webSite1.use(new Web_AA_User("客户A"));

        // 给客户创建一个博客类型的网站
        Web_AA_WebSite webSite2  = factory.getWeb_AA_WebSite("博客");
        webSite2.use(new Web_AA_User("客户B"));

        // 给客户创建一个博客类型的网站
        Web_AA_WebSite webSite3  = factory.getWeb_AA_WebSite("博客");
        webSite3.use(new Web_AA_User("客户C"));

        // 给客户创建一个新闻发布类型的网站
        Web_AA_WebSite webSite4  = factory.getWeb_AA_WebSite("新闻发布");
        webSite4.use(new Web_AA_User("客户D"));

        // 给客户创建一个公众号类型的网站
        Web_AA_WebSite webSite5  = factory.getWeb_AA_WebSite("公众号");
        webSite5.use(new Web_AA_User("客户E"));

        // 给客户创建一个公众号类型的网站
        Web_AA_WebSite webSite6  = factory.getWeb_AA_WebSite("公众号");
        webSite6.use(new Web_AA_User("客户F"));

        // 查看一下连接池中的实例数
        System.out.println("实例数：" + factory.getWebSiteCount());
    }
}
