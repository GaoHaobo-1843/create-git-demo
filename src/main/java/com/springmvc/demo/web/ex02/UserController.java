package com.springmvc.demo.web.ex02;

import javax.sound.midi.VoiceStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.media.jfxmedia.control.VideoDataBuffer;

@Controller
@RequestMapping(value="/user")
public @ResponseBody class UserController {
	@RequestMapping(value="/test1" ,method=RequestMethod.GET)
	public User test1() {
		User user = new User();
		user.setId(5L);
		user.setUserName("admin");
		user.setPassword("123456");
		return user;
	}
	@RequestMapping(value="save",method=RequestMethod.GET)
	public @ResponseBody String save (User user) {
		return "Obtained parameter save " + user;
	}
}
