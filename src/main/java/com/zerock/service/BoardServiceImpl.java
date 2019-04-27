package com.zerock.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.command.BoardVO;
import com.zerock.command.ScoreVO;
import com.zerock.dao.BoardDAO;
import com.zerock.mapper.BoardMapper;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	
//
//	@Autowired
//	BoardDAO boardDAO;
//	
//	
//	
//	@Override
//	public void register(String name, String title, String content) {
//		
//		boardDAO.boardInsert(name, title, content);
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		
//		return null;
//	}
//
//	@Override
//	public void delete(String num) {
//		
//		
//	}

	///------------------------mybatis 이용하기--------------------------------
	/*
	create table board01 (
		num int auto_increment primary key,
	    name varchar(30),
	    title varchar(30),
	    content varchar(50)
	 
	 );

	*/
	//Mybatis매퍼를 생성하고, 등록 처리.
	@Autowired //autowired 사용후에는 root-xml 마이바티스 스캔태그 여부를 확인
	BoardMapper mapper;
	
	@Override
	public void register(String name, String title, String content) {
		
		//map에 값을 추가하는 메서드 put()
		HashMap<String, String> map = new HashMap<>();
		map.put("p1", name);
		map.put("p2", title);
		map.put("p3", content);
		
		mapper.boardInsert(map);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		ArrayList<BoardVO> list = mapper.boardSelect();
		
		return list;
	}

	@Override
	public void delete(String num) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
