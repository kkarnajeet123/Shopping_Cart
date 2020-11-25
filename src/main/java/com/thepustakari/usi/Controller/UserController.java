package com.thepustakari.usi.Controller;

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

import com.thepustakari.usi.Model.UserInfo;
import com.thepustakari.usi.Service.UserService;


@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	
	private final UserService userService;
	@Autowired
	public UserController(UserService userService) {
		this.userService=  userService;
	}
	
	@PostMapping
	public void saveUserInfo(@RequestBody UserInfo userInfo) {
		userService.saveUserInfo(userInfo); 
	}
	
	@PutMapping
	public void updateUserInfo(@RequestBody UserInfo userInfo) {
		userService.updateUserInfo(userInfo);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserInfo(@PathVariable int id) {
		userService.deleteUserInfo(id);
	} 
	@GetMapping("/{id}")
	public UserInfo getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@GetMapping
	public List<UserInfo> getAllUser(){
		return userService.getAllUserInfo();
	}
	
}
