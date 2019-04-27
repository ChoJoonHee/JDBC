package com.zerock.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import com.zerock.command.BoardVO;

public interface BoardMapper {

	public void boardInsert(HashMap<String, String> map); //게시글 등록메서드
	
	public ArrayList<BoardVO> boardSelect(); //모든 게시글 가져오기
	public void boardDelete(String num); //삭제 메서드
}
