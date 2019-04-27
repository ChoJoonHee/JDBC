package com.zerock.dao;

import java.util.ArrayList;

import com.zerock.command.ScoreVO;

public interface ScoreDAO {

	public void scoreInsert(ScoreVO vo);
	public ArrayList<ScoreVO> scoreSelect();
	public void scoreDelete(String num);
	
}
