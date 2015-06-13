package org.bond.dubbo.provider;

import org.bond.dubbo.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements IDemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public int add(int a, int b) {
		return a + b;
	}

}