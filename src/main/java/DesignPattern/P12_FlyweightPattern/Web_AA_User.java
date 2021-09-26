package DesignPattern.P12_FlyweightPattern;

/*
* 享元模式：外部属性
* */
public class Web_AA_User {
    private String name;
    public Web_AA_User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
