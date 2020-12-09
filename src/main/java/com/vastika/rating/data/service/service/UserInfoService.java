package com.vastika.rating.data.service.service;

import java.util.List;

import com.vastika.rating.data.service.model.Address;
import com.vastika.rating.data.service.model.UserInfo;
import com.vastika.rating.data.service.model.UserInfoJsonBinding;

public interface UserInfoService {

	void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding);

	void updateUserInfo(UserInfoJsonBinding userInfo);

	void deleteUserInfo(long userId);

	UserInfo getUserInfoById(long userId);
	
	
	List<UserInfo> getAllUserInfo();
}
