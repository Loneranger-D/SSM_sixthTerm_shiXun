package com.service.impl;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;

@Service  //ǧ��Ҫ�������ע��
public class UserServiceImpl implements UserService {

	@Resource  //�������ע��,������������spring������ע����������
	private UserMapper userMapper;
	
	public User loginByNameOrEmail(String s) {
		return userMapper.loginByNameOrEmail(s);
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public List<User> listUser() {
		return userMapper.listUser();
	}

	@Override
	public User getUserById(Integer userId) {
		return userMapper.getUserById(userId);
	}
}
