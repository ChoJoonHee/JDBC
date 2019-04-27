package com.zerock.mybatisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTest {

	@Autowired
	SqlSessionFactoryBean sqlFactory;
	
	@Test
	public void testFactory() {
		
		try {
			System.out.println(">>>>>>sqlFactory출력: " + sqlFactory);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
