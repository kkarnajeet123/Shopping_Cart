package com.vastika.rating.data.service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.rating.data.service.dto.AuthenticationRequest;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;
import com.vastika.rating.data.service.service.UserInfoService;
import com.vastika.rating.data.service.util.JwtUtil;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")

public class UserRegistrationController {
	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	public UserRegistrationController(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}


	@PostMapping
	public void saveUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {
		userInfoService.saveUserInfo(userInfoJsonBinding);

	}

	@PutMapping("/create")
	public void updateUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding) {

		userInfoService.saveUserInfo(userInfoJsonBinding);

	}

	@DeleteMapping("/list/{userInfoId}")

	@GetMapping("/list/{userInfoId}")
	public void deleteUserInfo(@PathVariable int userInfoId) {
		userInfoService.deleteUserInfo(userInfoId);
		System.out.println("=========================================================");
		System.out.println("User Record with userid " + userInfoId + "has been deleted!!");

	}

	@GetMapping("/list/{userInfoId}")
	public UserInfo getUserById(@PathVariable int userInfoId) {

		return userInfoService.getUserInfoById(userInfoId);
	}

	@GetMapping("/list")
	public List<UserInfo> getAllUserInfo() {

		// System.out.println(userInfoService.getAllUserInfo());
		return userInfoService.getAllUserInfo();

	}

}
