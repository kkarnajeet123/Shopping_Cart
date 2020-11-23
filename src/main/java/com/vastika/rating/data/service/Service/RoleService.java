package com.vastika.rating.data.service.Service;

import com.vastika.rating.data.service.model.Role;

public interface RoleService {

	void saveUserRole(Role role);
	void updateRole(Role role);
	void deleteRole(long userId);
}
