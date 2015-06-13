package org.bond.dubbo.consumer;

import org.bond.dubbo.service.IDemoService;
import org.bond.dubbo.service.SysProperty;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConsumerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			// VM 参数配置spring.profiles.active=develop
			SysProperty.isNullsetSysDevelop();

			context = new ClassPathXmlApplicationContext(
					"classpath:consumer/spring-core.xml");
			context.start();			

			IDemoService demoService = (IDemoService) context.getBean("demoService");

			System.out.println(demoService.sayHello("张三"));
			System.out.println(demoService.sayHello("李四"));
			System.out.println(demoService.sayHello("王五"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				// context.close();
			}
		}
	}

}
