package com.vastika.rating.data.service.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.AddressRepository;
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
		UserInfo userInfo = new UserInfo();
		//Role role = roleRepository.findById(userInfoJsonBinding.getRole()).get();
		
		Role role = roleRepository.findById(userInfoJsonBinding.getRole()).orElse(null);
		
		if (role==null) {
			 role = new Role();
			 
			 if(userInfoJsonBinding.getRole()==1) {
					role.setRoleName("Admin");
					System.out.println("The role is: "+role);
					
				}else {
					role.setRoleName("User");
					System.out.println("The role is: "+role);
				}
		}else {
			System.out.println("Row is null");
		}
		userInfo.setRole(role);
		
		
		Authentication authentication = authenticationRepository.findById(userInfoJsonBinding.getUserInfoId()).orElse(null);
		
		if(authentication==null) {
			
			authentication= new Authentication();
			
		}
		
		authentication.setUsername(userInfoJsonBinding.getEmail());
		authentication.setPassword(userInfoJsonBinding.getPassword());
	
		
		
		userInfo.setAuthnetication(authentication);
		userInfo.setFirstName(userInfoJsonBinding.getFirstName());
		userInfo.setLastName(userInfoJsonBinding.getLastName());
	
				
		List<Address>addressList= new ArrayList<>();
		
		addressList.add(new Address(userInfoJsonBinding.getAddress1(),userInfoJsonBinding.getAddress2(),userInfoJsonBinding.getCity(),userInfoJsonBinding.getState(),userInfoJsonBinding.getZipcode()));
		
		
		userInfo.setAddresses(addressList);
		
		userInfoRepository.save(userInfo);
		
		/*
		//Saving Role
		
		Role role = roleRepository.findById(userInfoJsonBinding.getRole()).get();
		
		if(userInfoJsonBinding.getRole()==1) {
			role.setRoleName("Admin");
		}else {
			role.setRoleName("User");
		}
		
		//roleRepository.save(role);
		
		//Saving Authentication
		Authentication authentication = new Authentication();
		authentication.setUsername(userInfoJsonBinding.getEmail());
		authentication.setPassword(userInfoJsonBinding.getPassword());
		
		//authenticationRepository.save(authentication);
		
		//Saving UserInfo
		UserInfo userInfo = new UserInfo();
		
		userInfo.setRole(role);
		userInfo.setAuthnetication(authentication);
		
		userInfo.setFirstName(userInfoJsonBinding.getFirstName());
		userInfo.setLastName(userInfoJsonBinding.getLastName());
		userInfo.setActive(userInfoJsonBinding.getActiveUserInfo());
		userInfo.setAuthnetication(authentication);
		userInfo.setRole(role);
		
		userInfoRepository.save(userInfo);
		
		Address address = addressRepository.findById(userInfoJsonBinding.getUserInfoId()).get();
		address.setAddress1(userInfoJsonBinding.getAddress1());
		address.setAddress2(userInfoJsonBinding.getAddress2());
		address.setCity(userInfoJsonBinding.getCity());
		address.setState(userInfoJsonBinding.getState());
		address.setZipcode(userInfoJsonBinding.getZipcode());
			
		List<Address>addressList= new ArrayList<>();
		
		addressList.addAll(addressList);
		
		userInfo.setAddresses(addressList);
		//Saving Address
		
	//	addressList.add(address.setAddress1(userInfoJsonBinding.getAddress1()));
		//addressList.add(userInfoJsonBinding.getAddress2());
		//addressList.add(userInfoJsonBinding.getCity());
		//addressList.add(userInfoJsonBinding.getState());
		//addressList.add(userInfoJsonBinding.getZipcode());

		
		*/
		
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

	@Override
	public Address addAddress(Address address) {
	
		//UserInfo userInfo = addressRepository.findById(address.getUserInfo().getUserId())
				
		UserInfo userInfo = userInfoRepository.findById(address.getUserInfo().getUserId()).orElse(null);
		
		if(null==userInfo) {
			userInfo = new UserInfo();
		}
		return null;
	}

}
