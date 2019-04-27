package com.zerock.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.command.BoardVO;
import com.zerock.command.ScoreVO;
import com.zerock.service.BoardService;

@Controller
@RequestMapping("/service/*")
public class BoardServiceController {

	@Autowired
	BoardService boardService;
	
	
	//화면처리
	@RequestMapping("/boardRegister")
	public String boardRegister() {
		
		return "service/boardRegister";
	}
	
	//폼 요청 처리(등록처리)
	@RequestMapping("/boardForm")
	public String boardForm(@RequestParam("name") String name,
			@RequestParam("title") String title,
			@RequestParam("content") String content
			) {
		
		boardService.register(name, title, content);
		
		return "service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		
		ArrayList<BoardVO> list = boardService.getList();
		
		model.addAttribute("boardList", list);
		
		System.out.println("cho~");
		
		return "service/boardList";
	}
}
