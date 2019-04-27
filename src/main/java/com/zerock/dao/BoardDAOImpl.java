package com.zerock.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.zerock.command.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	
	
	ArrayList<BoardVO> DB = new ArrayList<>();
	
	@Override
	public void boardInsert(String name, String title, String content) {
		
		BoardVO vo = new BoardVO();
		vo.setName(name);
		vo.setContent(content);
		vo.setTitle(title);
		
		DB.add(vo);
		System.out.println("게시물 수:" + DB.size());
	}

	@Override
	public ArrayList<BoardVO> boardSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void boardDelete(String num) {
		// TODO Auto-generated method stub

	}

}
