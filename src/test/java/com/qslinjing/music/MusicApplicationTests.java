package com.qslinjing.music;

import com.qslinjing.music.mapper.TestMapper;
import com.qslinjing.music.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MusicApplicationTests {

	@Autowired
	private TestMapper testMapper;
	@Test
	void contextLoads() {
		User update = new User();
		User insert = new User();
		testMapper.insertTest(insert);
		testMapper.updateTest(update);
	}

}
