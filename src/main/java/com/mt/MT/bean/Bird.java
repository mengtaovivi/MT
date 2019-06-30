package com.mt.MT.bean;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.DisposableBean;

import java.net.URL;
import java.util.ResourceBundle;

public class Bird implements Initializable , DisposableBean {

    public Bird() {
        System.out.println("Bird 午餐构造方法。。。");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Bird 初始化开始。。。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bird 销毁啦。。。");
    }
}
