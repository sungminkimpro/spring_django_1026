package kr.co.ikosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello")
	public String hello(Model m) {
		m.addAttribute("msg","�ȳ��ϼ��� ������ ����!");
		return "hello";
	}
	
	@RequestMapping(value = "/what")
	public String what(Model a) {
		a.addAttribute("msg1", "���ؿ�?");
		return "what";
	}
	
	@RequestMapping(value = "/how")
	public String how(Model h) {
		h.addAttribute("msg2", "��� ������?");
		h.addAttribute("msg3", "�� ������?");
		h.addAttribute("msg1", "���մϱ�?");
		return "what";
	}

}
