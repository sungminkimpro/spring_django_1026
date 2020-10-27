package kr.co.ikosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ikosmo.mvc.vo.BoardVO;
import kr.co.ikosmo.mvc.vo.memberInfoVO;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSessionTemplate ss;
	
	public List<BoardVO> getBoardList(){
		//
		return ss.selectList("board1.list");
	}
	
	public List<BoardVO> getContentList(){
		//
		return ss.selectList("board1.contentlist");
	}
	
	public List<BoardVO> getWriterList(){
		return ss.selectList("board1.wlist");
	}

	public List<memberInfoVO> getMemberList(){
		return ss.selectList("board1.mlist");
	}
	
}
