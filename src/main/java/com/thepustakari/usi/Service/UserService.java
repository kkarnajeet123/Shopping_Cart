package com.thepustakari.usi.Service;

import java.util.List;

import com.thepustakari.usi.Model.UserInfo;

public interface UserService {
	void saveUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(int id);
	UserInfo getUserById(int id);
	List <UserInfo> getAllUserInfo();

}
