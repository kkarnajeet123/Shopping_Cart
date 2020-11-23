package com.vastika.rating.data.service.Controller;
/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.rating.data.service.Service.UserJsonBindingService;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;


@RestController
@RequestMapping("/userjsonbinding")
@CrossOrigin (origins="*")
public class UserRegistrationJsonBindingController {
	
	private UserJsonBindingService userJsonBindingService;
	
	@Autowired
	public UserRegistrationJsonBindingController(UserJsonBindingService userJsonBindingService) {
		this.userJsonBindingService = userJsonBindingService;
	}
	
	@PostMapping
	public void saveUserInfoJson(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {
		
		userJsonBindingService.saveUserInfo(userInfoJsonBinding);
		
	}
	
	@PutMapping
	
	public void updateUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {
		userJsonBindingService.updateUserInfo(userInfoJsonBinding);
	}
	
	
	@DeleteMapping ("/{userInfoId}")
	@GetMapping
	public void deleteUserInfo(long userInfoId) {
		userJsonBindingService.deleteUserInfo(userInfoId);
	}
	@GetMapping ("/{userInfoId}")
	public UserInfoJsonBinding getUserById(long userInfoId) {
		return userJsonBindingService.getUserInfoById(userInfoId);
	}
	
	@GetMapping
	public List<UserInfoJsonBinding> getAllUserInfo(){
		return userJsonBindingService.getUserInfo();
	}
}
*/