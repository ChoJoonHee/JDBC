package com.zerock.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.zerock.command.ScoreVO;
import com.zerock.dao.ScoreDAO;
import com.zerock.mapper.ScoreMapper;

//@Component //해당 어노테이션이 붙어 있는 클래스를 스프링 컨테이너에 생성합니다.
//@Repository //해당 어노테이션을 사용하려면 스프링 컨테이너에 컴포넌트 스캔명령이 추가되어야 합니다.
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {


//	//멤버변수
//	@Autowired
//	ScoreDAO scoreDAO; //=new ScoreDAOImpl();
//	
//	
//	@Override
//	public void scoreRegister(ScoreVO vo) {
//		
//		scoreDAO.scoreInsert(vo);
//		
//	}
//	//점수 결과 보기 메서드
//	@Override 
//	public ArrayList<ScoreVO> scoreResult() {
//		
//		ArrayList<ScoreVO> list =scoreDAO.scoreSelect();
//		
//		return list;
//	}
//	
//	@Override
//	public void scoreDelete(String num) {
//		
//		scoreDAO.scoreDelete(num);
//	}

	//----------------------------------mybatis 이용하기--------------------------------------
	
	@Autowired
	ScoreMapper mapper;

	@Override
	public void scoreRegister(ScoreVO vo) {
		
		mapper.scoreInsert(vo);
		
	}

	@Override
	public ArrayList<ScoreVO> scoreResult() {
		
		ArrayList<ScoreVO> list = mapper.scoreSelect();
		
		return list;
	}

	@Override
	public void scoreDelete(String num) {
		
		//sql = delete from score01 where num = ?;
		mapper.scoreDelete(num);
		
	}
	
	
	
	
	
	
	
}






