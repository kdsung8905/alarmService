package com.aprocni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprocni.service.TestService;
import com.aprocni.vo.ChannelVO;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/")
	public String hello() {
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++ insertTest +++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++ insertTest +++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++ insertTest +++++++++++++++++++++++++++++++++++++++++++++++");
		
		ChannelVO vo = new ChannelVO();
		vo.setChannelId("success01");
		vo.setChannelNm("성공부가세테스트");
		vo.setSecretKey("toTkrqhfl");
		vo.setUseYn("Y");
		
		//testService.joinChannel(vo);
		
		testService.selectChannel();
		
		
		return "spring boot hello world";
	}

}
