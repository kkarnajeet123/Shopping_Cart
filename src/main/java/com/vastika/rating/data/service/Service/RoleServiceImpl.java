package com.vastika.rating.data.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.Repository.RoleRepository;
import com.vastika.rating.data.service.model.Role;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void saveUserRole(Role role) {
		roleRepository.save(role);

	}

	@Override
	public void updateRole(Role role) {
		roleRepository.save(role);

	}

	@Override
	public void deleteRole(long userId) {
		roleRepository.deleteById(userId);

	}

}
