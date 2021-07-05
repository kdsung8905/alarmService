package com.aprocni.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprocni.mapper.TestMapper;
import com.aprocni.vo.ChannelVO;

@Service
public class TestService {
	
	@Autowired
	TestMapper testMapper;
	
	public void joinChannel(ChannelVO vo) {
		System.out.println("service start =============================");
		
		testMapper.joinChannel(vo);
		
	}
	
	public List<ChannelVO> selectChannel(){
		return testMapper.selectChannel();
	}
	
	

}
