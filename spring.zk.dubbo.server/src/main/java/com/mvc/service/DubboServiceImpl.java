package com.mvc.service;

import org.springframework.stereotype.Service;

@Service("dubboService")
public class DubboServiceImpl implements DubboService {

	@Override
	public void say(String name) {
		System.out.println("say hello to ".concat(name));
	}

}
