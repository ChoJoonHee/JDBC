package com.zerock.service;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreService {

	//점수 등록 요청 메서드
	public void scoreRegister(ScoreVO vo);
	//점수 저장 결과 보기 메서드
	public ArrayList<ScoreVO> scoreResult();
	//점수 삭제 메서드
	public void scoreDelete(String num);
	
}
