package com.vastika.rating.data.service.Service;

import com.vastika.rating.data.service.model.Authentication;

public interface AuthenticationService {
	
	void saveUserAuthentication (Authentication authentication);
	void updateUserAuthentication (Authentication authentication);
	void deleteUserAuthentication (long userId);

}
