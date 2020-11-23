package com.vastika.rating.data.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.rating.data.service.Service.AddressService;
import com.vastika.rating.data.service.Service.AuthenticationService;
import com.vastika.rating.data.service.Service.RoleService;
import com.vastika.rating.data.service.Service.UserInfoService;
//import com.vastika.rating.data.service.Service.UserJsonBindingService;
import com.vastika.rating.data.service.model.Address;
import com.vastika.rating.data.service.model.Authentication;
import com.vastika.rating.data.service.model.Role;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")

public class UserRegistrationController {
	@Autowired
	private UserInfoService userInfoService;

	// private UserJsonBindingService userJsonBindingService;

	@Autowired
	private Authentication authentication;

	@Autowired
	AddressService addressService;

	@Autowired
	RoleService roleService;

	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	UserInfoService userInfoservice;

	@Autowired
	public UserRegistrationController(UserInfoService userInfoService) {
		this.userInfoservice = userInfoService;
	}

	@PostMapping
	public void saveUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {

		userInfoservice.saveUserInfo(userInfoJsonBinding);

	}

//	@PutMapping
//	public void updateUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {
//
//		/*--------------------------------------------------------------------------------*/
//		//save User Info
//		if(userInfoJsonBinding.getRole()==1) {
//			role.setRoleName("Admin");
//		}else {
//			role.setRoleName("User");
//		}
//		roleService.saveUserRole(role);
//		
//		/*--------------------------------------------------------------------------------*/
//		//save Authentication Info
//		
//		authentication.setUsername(userInfoJsonBinding.getEmail());
//		authentication.setPassword(userInfoJsonBinding.getPassword());
//		authenticationService.saveUserAuthentication(authentication);
//		/*--------------------------------------------------------------------------------*/
//		//save User Info
//		userInfo.setFirstName(userInfoJsonBinding.getFirstName());
//		userInfo.setLastName(userInfoJsonBinding.getLastName());
//		userInfo.setActive(userInfoJsonBinding.getActiveUserInfo());
//		
//		userInfo.setRole(role);
//		userInfo.setAuthnetication(authentication);
//		
//		userInfoservice.saveUserInfo(userInfo);
//				
//		/*--------------------------------------------------------------------------------*/
//		//save Address Info//
//		
//		address.setAddress1(userInfoJsonBinding.getAddress1());
//		address.setAddress2(userInfoJsonBinding.getAddress2());
//		address.setCity(userInfoJsonBinding.getCity());
//		address.setState(userInfoJsonBinding.getState());
//		address.setZipcode(userInfoJsonBinding.getZipcode());
//		address.setUserInfo(userInfo);
//		addressService.saveAddress(address);
//		
//		System.out.println("=========================================================");
//		System.out.println("User Record has been updated!!");
//	
//}	

	/*
	 * 
	 * @DeleteMapping("/{userInfoId}")
	 * 
	 * @GetMapping("/{userInfoId}") public void deleteUserInfo(@PathVariable int
	 * userInfoId) { userInfoService.deleteUserInfo(userInfoId); System.out.println(
	 * "=========================================================");
	 * System.out.println("User Record with userid " + userInfoId +
	 * " has been deleted!!");
	 * 
	 * }
	 * 
	 * 
	 * @GetMapping("/{userInfoId}") public UserInfo getUserById(@PathVariable int
	 * userInfoId) {
	 * 
	 * return userInfoService.getUserInfoById(userInfoId); }
	 * 
	 * 
	 * @GetMapping public List<UserInfo> getAllUserInfo() { return
	 * userInfoService.getAllUserInfo(); }
	 */
}
