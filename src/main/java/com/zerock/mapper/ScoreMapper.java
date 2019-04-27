package com.zerock.mapper;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreMapper {
	
	public void scoreInsert(ScoreVO vo);
	public ArrayList<ScoreVO> scoreSelect();
	public void scoreDelete(String num);
}
