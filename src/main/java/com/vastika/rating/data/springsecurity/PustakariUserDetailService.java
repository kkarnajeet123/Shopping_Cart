package com.vastika.rating.data.springsecurity;
/*
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.UserLoginValidationRepository;
import com.vastika.rating.data.service.model.Authentication;


public class PustakariUserDetailService implements UserDetailsService{

	@Autowired
	UserLoginValidationRepository userLoginValidationRepository ;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Authentication> authentication=userLoginValidationRepository.findbyUserName(username);
		
		authentication.orElseThrow(()-> new UsernameNotFoundException ("Not Found: "+ username));
		
		return authentication.map(PustakariUserDetail::new).get();
	}

}
*/
