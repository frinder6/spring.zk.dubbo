package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.service.DubboService;

@Controller
@RequestMapping("/dubbo")
public class DubboController {

	@Autowired
	private DubboService dubboService;

	@RequestMapping("/say")
	public ModelAndView say() {
		this.dubboService.say("hello...");
		return new ModelAndView("index");
	}

}
