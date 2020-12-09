package com.vastika.rating.data.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class AuthenticationRequest {

	private String Username;
	private String Password;
	
	
}
