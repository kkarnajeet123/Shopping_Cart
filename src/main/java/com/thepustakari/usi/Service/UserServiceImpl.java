package com.thepustakari.usi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepustakari.usi.Model.UserInfo;
import com.thepustakari.usi.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository=userRepository; 
	}

	@Override
	public void saveUserInfo(UserInfo userInfo) {
		userRepository.save(userInfo);
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		userRepository.save(userInfo);
		
	}

	@Override
	public void deleteUserInfo(int id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public List<UserInfo> getAllUserInfo() {
		
		return userRepository.findAll();
	}

	@Override
	public UserInfo getUserById(int id) {
		
		return userRepository.findById(id).get();
	}

}
