package DesignPattern.P12_FlyweightPattern;



import java.util.HashMap;

/**
 * 网站工厂类，根据需要返回
 */
public class Web_BB_WebSiteFactory {

    //模拟连接池
    private HashMap<String, Web_BB_ConcreteWebSite> pool = new HashMap<>();

    /**
     * 获取网站：根据传入的类型，返回网站，无则创建，有则直接返回
     *
     * @param type
     * @return
     */
    public  Web_AA_WebSite getWeb_AA_WebSite(String type){
        if(!pool.containsKey(type)){
            pool.put(type, new Web_BB_ConcreteWebSite(type));
        }
        return (Web_AA_WebSite)pool.get(type);
    }

    /**
     *获取网站分类总数
     */
    public int getWebSiteCount(){
        return pool.size();
    }


}
