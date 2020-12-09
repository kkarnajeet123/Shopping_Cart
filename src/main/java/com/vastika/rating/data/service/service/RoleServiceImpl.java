package com.vastika.rating.data.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.rating.data.service.model.Role;
import com.vastika.rating.data.service.repository.RoleRepository;
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
