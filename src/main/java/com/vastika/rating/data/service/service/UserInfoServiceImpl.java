package com.vastika.rating.data.service.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.model.Address;
import com.vastika.rating.data.service.model.Authentication;
import com.vastika.rating.data.service.model.Role;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;
import com.vastika.rating.data.service.repository.AuthenticationRepository;
import com.vastika.rating.data.service.repository.RoleRepository;
import com.vastika.rating.data.service.repository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private AuthenticationRepository authenticationRepository;
	
	@Autowired
	private Authentication authentication;
		
	@Override
	public void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding) {
		UserInfo userInfo = new UserInfo();
		
		
		Role role = roleRepository.findById(userInfoJsonBinding.getRole()).orElse(null);
		
		if (role==null) {
			 role = new Role();
			 
			 if(userInfoJsonBinding.getRole()==1) {
					role.setRoleName("Admin");
					System.out.println("The role is: "+role.getRoleName());
					
				}else {
					role.setRoleName("User");
					System.out.println("The role is: "+role.getRoleName());
				}
		}else {
			System.out.println("Role is null");
		}
		userInfo.setRole(role);
		
		
		Authentication authentication = authenticationRepository.findById(userInfoJsonBinding.getUserInfoId()).orElse(null);
		
		if(authentication==null) {
			
			authentication= new Authentication();
			
		}
		
		authentication.setUserName(userInfoJsonBinding.getEmail());
		authentication.setPassword(userInfoJsonBinding.getPassword());
		
		
		userInfo.setAuthentication(authentication);
		userInfo.setFirstName(userInfoJsonBinding.getFirstName());
		userInfo.setLastName(userInfoJsonBinding.getLastName());
		userInfo.setActive(userInfoJsonBinding.getActiveUserInfo());
		
		System.out.println("----------------------------------------------");
		System.out.println(userInfo.getActive());
		System.out.println(userInfoJsonBinding.getActiveUserInfo());
		System.out.println("----------------------------------------------");
			
		
				
		List<Address>addressList= new ArrayList<>();
		
		addressList.add(new Address(userInfoJsonBinding.getAddress1(),userInfoJsonBinding.getAddress2(),userInfoJsonBinding.getCity(),userInfoJsonBinding.getState(),userInfoJsonBinding.getZipcode(),userInfo));
		
		
		userInfo.setAddresses(addressList);
		
		userInfoRepository.save(userInfo);
	}

	@Override
	public void updateUserInfo(UserInfoJsonBinding userInfoJsonBinding) {
		
		UserInfo userInfo = new UserInfo();

		userInfoRepository.save(userInfo);

	}

	@Override
	public void deleteUserInfo(long userId) {
		userInfoRepository.deleteById(userId);

	}

	@Override
	public UserInfo getUserInfoById(long userId) {
		
		return userInfoRepository.findById(userId).get();
	}

	@Override
	public List<UserInfo> getAllUserInfo() {
		
		return userInfoRepository.findAll();
	}


}
