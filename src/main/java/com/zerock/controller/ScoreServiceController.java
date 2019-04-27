package com.zerock.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.ScoreVO;
import com.zerock.service.ScoreService;
import com.zerock.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service/*")
public class ScoreServiceController {
	
	//1st
	//ScoreService scoreService = new ScoreServiceImpl();
	
	//2nd
//	@Autowired //컨테이너 안의 bean객체 자동으로 타입으로 찾아서 주입.
//	ScoreService scoreService;
	
	//3nd
	
	//@Resource(name = "scoreService")
	@Autowired //service계층에 어노테이션을 통해 자동으로 객체를 생성
	ScoreService scoreService;
	
	//화면처리
	@RequestMapping("/1scoreRegister")
	public String score() {
		
		return "service/1scoreRegister";
	}
	
	//점수 등록 처리 메서드
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
		
		scoreService.scoreRegister(vo);
		
		return "service/2scoreResult"; 
	}
	
	//점수 리스트 보기 메서드
	@RequestMapping("/3scoreList")
	public String scoreList(Model model) {
		
		ArrayList<ScoreVO> list = scoreService.scoreResult();
		
		model.addAttribute("scoreList", list);
		
		System.out.println("탓어~");
		
		return "service/3scoreList";
	}
	
	//점수 삭제 메서드
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") String num) {
		
		//삭제 메서드
		scoreService.scoreDelete(num);
		
		//return "service/3scoreList"; //컨테이너 뷰 리졸버로 보내는 요청
		return "redirect:/service/3scoreList"; //★다시 컨트롤러를 탈수 있는 강제이동 redirect: 
	}
	
	
	
	
}





