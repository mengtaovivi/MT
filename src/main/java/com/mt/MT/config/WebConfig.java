package com.mt.MT.config;

import com.mt.MT.bean.Bird;
import com.mt.MT.bean.Fish;
import com.mt.MT.bean.MyBeanPostProcessor;
import com.mt.MT.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    /**
     * 单利模式下，容器启动时加载
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destory")
    public User User(){
        return  new User();
    }

    /**
     * 多例模式下，容器启动并不会加载，只能是用到了再加载，容器销毁的时候并不会调用销毁方法
     * @return
     */
    @Bean
    public Bird Bird(){
        return  new Bird() ;
    }

    @Bean
    public Fish Fish(){
        return  new Fish() ;
    }

    @Bean
    public MyBeanPostProcessor MyBeanPostProcessor(){
        return new MyBeanPostProcessor() ;
    }

}
