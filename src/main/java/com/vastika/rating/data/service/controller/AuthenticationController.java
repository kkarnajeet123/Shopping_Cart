package com.vastika.rating.data.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.rating.data.service.dto.AuthenticationRequest;
import com.vastika.rating.data.service.util.JwtUtil;

@RestController
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/welcome")
	public String welcome() {
		return "I will build this website no matter what!! I can't give up!!!";
	}

	@PostMapping("/authenticate")
	public String getToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

		try {
			authenticationManager.authenticate(

					new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
							authenticationRequest.getPassword()));
		} catch (Exception e) {
			throw new Exception("Invalid Username or Password!!!");
		}

		return jwtUtil.generateToken(authenticationRequest.getUsername());
	}
}
