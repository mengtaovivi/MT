package com.mt.MT.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 指定初始化、销毁方法
 */
public class Fish {

    public Fish() {
        System.out.println("调用无参构造器创建Fish");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化Fish");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁Fish");
    }

}
