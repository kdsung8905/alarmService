package com.aprocni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.aprocni.vo.ChannelVO;

@Mapper
@Repository
public interface TestMapper {

	void joinChannel(ChannelVO vo);
	List<ChannelVO> selectChannel();
}
