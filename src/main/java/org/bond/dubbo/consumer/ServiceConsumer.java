package org.bond.dubbo.consumer;

import org.bond.dubbo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceConsumer {
	@Autowired
	private IDemoService demoService;

	public String sayHello(String name) {
		return demoService.sayHello(name);
	}
}
