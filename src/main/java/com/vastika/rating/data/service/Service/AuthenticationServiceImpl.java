package com.vastika.rating.data.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.AuthenticationRepository;
import com.vastika.rating.data.service.model.Authentication;
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	@Autowired
	private AuthenticationRepository authenticationRepository;
	
	@Override
	public void saveUserAuthentication(Authentication authentication) {
		authenticationRepository.save(authentication);

	}

	@Override
	public void updateUserAuthentication(Authentication authentication) {
		authenticationRepository.save(authentication);
	}

	@Override
	public void deleteUserAuthentication(long userId) {
		authenticationRepository.deleteById(userId);

	}

}
