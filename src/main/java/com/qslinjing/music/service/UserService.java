package com.qslinjing.music.service;

import com.qslinjing.music.model.User;

import java.util.List;

public interface UserService {
	List<User> queryAll(User user);

	User queryByExample(User user);

	int update(User user);

	int update(List<User> userList);

	int delete(Long id);

	int delete(String ids);

	int insert(User user);

	int insert(List<User> userList);

}
