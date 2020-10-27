package kr.co.ikosmo.mvc.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.ikosmo.mvc.dao.BoardDao;
import kr.co.ikosmo.mvc.vo.BoardVO;

@Controller
public class JsonpController {
	@Autowired
	private BoardDao dao;
	//custom view => json������ ���� �� ���� ���
	@RequestMapping(value = "/jsonpTest1", method = RequestMethod.GET)
	@ResponseBody
	public String testjson() {
		return "hi";
	}
	
	//spring 4X ����, PostMapping
	@GetMapping(value="/jsonpTest2")
	@ResponseBody
	public List<BoardVO> boardList(Model m){
		List<BoardVO> listv = dao.getBoardList();
		m.addAttribute("listv", listv);
		return listv;
	}
	@RequestMapping(value = "/jsonpTest3", method = RequestMethod.GET)
	@ResponseBody
	// URL ��û�� ID ���� callback ���� ���ڷ� ���� �޴´�.
	public String jaonpTest(@RequestParam String callback) {
		Map<String, Object[]> paramMap = new HashMap<String, Object[]>();
		Object[] a1 = {"setosa",0.2, 0.2, 0.2, 0.2, 0.2, 0.4, 0.3, 0.2, 0.2, 0.1, 0.2, 0.2, 0.1, 0.1, 0.2, 0.4, 0.4, 0.3, 0.3, 0.3, 0.2, 0.4, 0.2, 0.5, 0.2, 0.2, 0.4, 0.2, 0.2, 0.2, 0.2, 0.4, 0.1, 0.2, 0.2, 0.2, 0.2, 0.1, 0.2, 0.2, 0.3, 0.3, 0.2, 0.6, 0.4, 0.3, 0.2, 0.2, 0.2, 0.2};
		Object[] a2 = {"versicolor",1.4, 1.5, 1.5, 1.3, 1.5, 1.3, 1.6, 1.0, 1.3, 1.4, 1.0, 1.5, 1.0, 1.4, 1.3, 1.4, 1.5, 1.0, 1.5, 1.1, 1.8, 1.3, 1.5, 1.2, 1.3, 1.4, 1.4, 1.7, 1.5, 1.0, 1.1, 1.0, 1.2, 1.6, 1.5, 1.6, 1.5, 1.3, 1.3, 1.3, 1.2, 1.4, 1.2, 1.0, 1.3, 1.2, 1.3, 1.3, 1.1, 1.3};
		Object[] a3 = {"virginica",2.5, 1.9, 2.1, 1.8, 2.2, 2.1, 1.7, 1.8, 1.8, 2.5, 2.0, 1.9, 2.1, 2.0, 2.4, 2.3, 1.8, 2.2, 2.3, 1.5, 2.3, 2.0, 2.0, 1.8, 2.1, 1.8, 1.8, 1.8, 2.1, 1.6, 1.9, 2.0, 2.2, 1.5, 1.4, 2.3, 2.4, 1.8, 1.8, 2.1, 2.4, 2.3, 1.9, 2.3, 2.5, 2.3, 1.9, 2.0, 2.3, 1.8};
		paramMap.put("setosa", a1);
		paramMap.put("versicolor", a2);
		paramMap.put("virginica", a3);
		String result = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(paramMap);
		}catch(JsonMappingException e) {
			e.printStackTrace();
		}catch(JsonGenerationException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//Jsonp �������� �����͸� �����Ѵ�.
		System.out.println(result);
		return callback + "(" + result + ")";
	}
	
	
}
