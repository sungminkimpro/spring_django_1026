package kr.co.ikosmo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ikosmo.mvc.dao.BoardDao;
import kr.co.ikosmo.mvc.vo.BoardVO;
import kr.co.ikosmo.mvc.vo.memberInfoVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDao dao;
	
	@GetMapping(value = "/boardlist")
	public String boardList(Model w) {
		List<BoardVO> listv = dao.getBoardList();
		w.addAttribute("listv",listv);
		return "boardList";
		
	}	
	
	@GetMapping(value = "/contentlist")
	public String contentList(Model c) {
		List<BoardVO> conlist = dao.getContentList();
		c.addAttribute("conlist",conlist);
		return "contentList";
		
	}
	
	@GetMapping(value = "/writerlist")
	public String writerlist(Model a) {
		List<BoardVO> wlist = dao.getWriterList();
		a.addAttribute("wlist", wlist);
		return "writerList";
		
		
	}

	@GetMapping(value = "/memberInfo")
	public String memberInfo(Model m) {
		List<memberInfoVO> mlist = dao.getMemberList();
		m.addAttribute("mlist", mlist);
		return "memberInfo";
	}
	
	
}
