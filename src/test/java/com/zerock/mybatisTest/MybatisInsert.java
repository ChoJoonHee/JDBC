package com.zerock.mybatisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zerock.command.ScoreVO;
import com.zerock.testmapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MybatisInsert {

	@Autowired
	TestMapper mapper;
	
	@Test
	public void insert() {
		ScoreVO vo = new ScoreVO();
		vo.setName("홍길숙");
		vo.setKor("100");
		vo.setEng("100");
		vo.setMath("100");
		
		boolean result = mapper.insert(vo);
		System.out.println("성공?:" + result);
	}
}













