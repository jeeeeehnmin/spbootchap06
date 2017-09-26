package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vo.PageVO;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/board")
@Log
public class WebBoardController {
	
	/*
	 * thymeleaf하고 jsp를 구분하여 실행하는 환경을 만들기 위해서
	 * chap06에서 -s는 thymeleaf, 단수는 jsp로 포워딩
	 */

	@GetMapping("/list")
	public String list(@ModelAttribute("xxx")PageVO vo, Model model){
		log.info("/board/list list()....");
		log.info("PageVO = " + vo);
		
		return "jsp/board/list";
	}
}
