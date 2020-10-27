package kr.co.ikosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello")
	public String hello(Model m) {
		m.addAttribute("msg","안녕하세요 스프링 복습!");
		return "hello";
	}
	
	@RequestMapping(value = "/what")
	public String what(Model a) {
		a.addAttribute("msg1", "뭐해요?");
		return "what";
	}
	
	@RequestMapping(value = "/how")
	public String how(Model h) {
		h.addAttribute("msg2", "어떻게 지내요?");
		h.addAttribute("msg3", "잘 지내요?");
		h.addAttribute("msg1", "뭐합니까?");
		return "what";
	}

}
