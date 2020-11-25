package com.thepustakari.usi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thepustakari.usi.Model.UserInfo;
import com.thepustakari.usi.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * @Autowired public UserServiceImpl(UserRepository userRepository) {
	 * this.userRepository=userRepository; }
	 */

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
	public UserInfo getUserById(int id) {
		
		return userRepository.findById(id).get();
	}
	
	@Override
	public List<UserInfo> getAllUserInfo() {
		//return list<UserInfo>
		List<UserInfo> userInfo=new ArrayList<UserInfo>();
		userRepository.findAll().forEach(userInfo::add);
		return userInfo;
	}

}
