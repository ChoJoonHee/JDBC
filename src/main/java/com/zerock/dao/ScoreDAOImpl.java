package com.zerock.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zerock.command.ScoreVO;

//@Component
@Repository
public class ScoreDAOImpl implements ScoreDAO {

	

//	//DB에 대한 작업이 기술
//	//DB가정
//	ArrayList<ScoreVO> DB = new ArrayList<>();
//
//	@Override
//	public void scoreInsert(ScoreVO vo) {
//
//		DB.add(vo); //DB에 추가하는 작업
//		System.out.println("현재 게시물 수:" + DB.size());
//		
//	}
//	
//	//게시물 리스트 보기 메서드
//	@Override
//	public ArrayList<ScoreVO> scoreSelect() {
//		
//		return DB;
//	}
//
//	@Override
//	public void scoreDelete(String num) {
//		//자바의 문자열 -> 숫자로 변경하는 작업
//		int index = Integer.parseInt(num);
//		DB.remove(index);
//		
//	}
	
	//-------------------------JDBC Template----------------------------
	
	//스프링 컨테이너에 있는 bean 자동 주입하는 명령
	@Autowired
	private JdbcTemplate jdbcTemplate; //= new jdbcTemplate()
	
	
	@Override
	public void scoreInsert(ScoreVO vo) {
		
		String sql ="insert into score01(name, kor, eng, math) values (?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] { 
				vo.getName(), 
				vo.getKor(), 
				vo.getEng(), 
				vo.getMath()  
		} );
	}

	@Override
	public ArrayList<ScoreVO> scoreSelect() {
		
		String sql = "select * from score01";
		List<ScoreVO> list = jdbcTemplate.query(sql, new Object[] {} , new RowMapper<ScoreVO>() {

			@Override
			public ScoreVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				ScoreVO vo = new ScoreVO();
				
				vo.setNum( rs.getInt("num"));
				vo.setName( rs.getString("name")   );  
				vo.setKor( rs.getString("kor")  );
				vo.setMath( rs.getString("math"));
				vo.setEng( rs.getString("eng"));
				
				return vo;
			}
	
		});

		//현재 메서드의 리턴
		return (ArrayList<ScoreVO>)list;
	}

	@Override
	public void scoreDelete(String num) {
		
		String sql = "delete from score01 where num = ?";
		jdbcTemplate.update(sql, new Object[] {num} );
		
	}
	
	
	
}



