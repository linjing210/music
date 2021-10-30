package com.qslinjing.music.controller;

import com.qslinjing.music.model.User;
import com.qslinjing.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 20:23
 * @project music
 */

@RestController("/user")
public class UserController {
	@Autowired
	private UserService userService;


	@GetMapping("/")
	public List<User> queryAll(User user) {
		return userService.queryAll(user);
	}

	public User queryByExample(User user) {
		return userService.queryByExample(user);
	}

	public int update(User user) {
		return userService.update(user);
	}

	public int update(List<User> userList) {
		return 0;
	}

	public int delete(Long id) {
		return userService.delete(id);
	}

	public int delete(String ids) {
		return userService.delete(ids);
	}

	public int insert(User user) {
		return userService.insert(user);
	}

	public int insert(List<User> userList) {
		return userService.insert(userList);
	}
}
