package com.mt.MT.bean;

public class User {

    public User() {
        System.out.println("调用午餐构造器创建爱你User");
    }

    public void init() {
        System.out.println("初始化User");
    }
    public void destory() {
        System.out.println("销毁User");
    }

    public String helloWorld(){
        return "hello cainiao" ;
    }

}
