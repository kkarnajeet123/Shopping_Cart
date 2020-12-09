package com.vastika.rating.data.service.service;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.UserJsonBindingRepository;

import com.vastika.rating.data.service.model.UserInfoJsonBinding;

@Service
public class UserJsonBindingServiceImpl implements UserJsonBindingService {
	
	private UserJsonBindingRepository userRepository;
	
	@Autowired
	public UserJsonBindingServiceImpl(UserJsonBindingRepository userRepository) {
		this.userRepository=userRepository;
	}
	@Override
	public void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding) {
		userRepository.save(userInfoJsonBinding);
		
		
	}
	@Override
	public void updateUserInfo(UserInfoJsonBinding userInfoJsonBinding) {

		
		userRepository.save(userInfoJsonBinding);
		
		
	}
	@Override
	public void deleteUserInfo(long userInfoId) {
		userRepository.deleteById(userInfoId);
		
	}
	@Override
	public UserInfoJsonBinding getUserInfoById(long userInfoId) {
		
		return userRepository.findById(userInfoId).get();
	}
	@Override
	public List<UserInfoJsonBinding> getUserInfo() {
		
		return userRepository.findAll();
	}

}
*/