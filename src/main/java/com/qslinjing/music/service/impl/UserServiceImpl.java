package com.qslinjing.music.service.impl;

import com.qslinjing.music.mapper.UserMapper;
import com.qslinjing.music.model.User;
import com.qslinjing.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 一曲离殇、
 * @version v1.0
 * @date 2021/10/30 20:23
 * @project music
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> queryAll(User user) {
		return userMapper.select(user);
	}

	@Override
	public User queryByExample(User user) {
		return userMapper.selectOne(user);
	}

	@Override
	public int update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int update(List<User> userList) {
		return 0;
	}

	@Override
	public int delete(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int delete(String ids) {
		return userMapper.deleteByIds(ids);
	}

	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int insert(List<User> userList) {
		return userMapper.insertList(userList);
	}
}
