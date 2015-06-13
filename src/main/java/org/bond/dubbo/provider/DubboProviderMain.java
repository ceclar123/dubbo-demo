package org.bond.dubbo.provider;

import java.util.concurrent.CountDownLatch;

import org.bond.dubbo.service.SysProperty;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderMain {

	public static void main(String[] args) {
		try {
			// VM 参数配置spring.profiles.active=develop
			SysProperty.isNullsetSysDevelop();
			System.out.println("DubboServer starting------"
					+ System.getProperty("spring.profiles.active"));

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:provider/spring-core.xml");
			context.start();

			System.out.println("DubboServer started------"
					+ System.getProperty("spring.profiles.active"));

			new CountDownLatch(1).await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
