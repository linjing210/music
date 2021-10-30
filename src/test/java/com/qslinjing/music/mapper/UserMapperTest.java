package com.qslinjing.music.mapper;

import com.qslinjing.music.dict.UserTypeDict;
import com.qslinjing.music.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 14:52
 * @project music
 */
@Slf4j
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	void queryAll(){
		userMapper.selectAll().forEach(user -> log.info("{}", user));
	}


	@Test
	void insert(){
		User user = new User();
		user.setUsername("test2").setAccount("123456")
			.setPassword("123456").setUserType(UserTypeDict.COMMON);
		userMapper.insertSelective(user);
		System.out.println("user = " + user);
	}
}
