package com.vastika.rating.data.service.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.AuthenticationRepository;
import com.vastika.rating.data.service.Repository.RoleRepository;
import com.vastika.rating.data.service.Repository.UserInfoRepository;
import com.vastika.rating.data.service.model.Address;
import com.vastika.rating.data.service.model.Authentication;
import com.vastika.rating.data.service.model.Role;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;
@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private AuthenticationRepository authenticationRepository;
	
	@Override
	public void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding) {
		
		
		Role role = roleRepository.findById(userInfoJsonBinding.getRole()).get();
		
		Authentication authentication = new Authentication();
		authentication.setUsername(userInfoJsonBinding.getEmail());
		authentication.setPassword(userInfoJsonBinding.getPassword());
		
		Address address = new Address();
		
		List<Address>addressList= new ArrayList<>();
		
	//	addressList.add(address.setAddress1(userInfoJsonBinding.getAddress1()));
		//addressList.add(userInfoJsonBinding.getAddress2());
		//addressList.add(userInfoJsonBinding.getCity());
		//addressList.add(userInfoJsonBinding.getState());
		//addressList.add(userInfoJsonBinding.getZipcode());
		
		
		
		UserInfo userInfo = new UserInfo();
		userInfo.setRole(role);
		userInfo.setAuthnetication(authentication);
		
		userInfo.setFirstName(userInfoJsonBinding.getFirstName());
		
		//userInfo.setAddresses();
		//userInfo.setAddresses();
		//userInfo.setAuthnetication(userInfoJsonBinding.getEmail());
		
		
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
