package com.vastika.rating.data.service.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.model.Authentication;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;
import com.vastika.rating.data.service.repository.AuthenticationRepository;
import com.vastika.rating.data.service.repository.UserInfoRepository;

@Service
public class CustomUserInfoService implements UserDetailsService{

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserInfo userInfo = userInfoRepository.findByusername(username);
		
		return new User(userInfo.getAuthentication().getUserName(),userInfo.getAuthentication().getPassword(), new ArrayList<>());
		
	}

}
