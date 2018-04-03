package com.springmvc.demo.web.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public  @ResponseBody String sayHello() {
		return "Hello Spring MVC!";
	}
}