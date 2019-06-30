package com.mt.MT;

import com.mt.MT.bean.User;
import com.mt.MT.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MtApplicationTests {

	@Test
	public void contextLoads() {
		// 返回 IOC 容器，使用注解配置，传入配置类
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
//		User user = context.getBean(User.class);
//		System.out.println(user.helloWorld());
		System.out.println("容器创建完毕");
		// 关闭 IOC 容器
		context.close();

	}

}
