package com.thepustakari.usi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.thepustakari.usi.Model.UserInfo;
@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserInfo, Integer>{
	

}
