package com.zerock.testmapper;

import com.zerock.command.ScoreVO;

//DAO인터페이스를 대신하는 Mybatis의 인터페이스
public interface TestMapper {

	public String getTime();
	public boolean insert(ScoreVO vo);
	
}
