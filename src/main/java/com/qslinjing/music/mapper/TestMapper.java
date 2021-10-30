package com.qslinjing.music.mapper;

import com.qslinjing.music.model.User;
import org.springframework.stereotype.Component;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 19:28
 * @project music
 */

@Component
public class TestMapper {

	public void insertTest(User user){
		System.out.println("insertTest: " + user);
	}

	public void updateTest(User user){
		System.out.println("updateTest: " + user);
	}


}
