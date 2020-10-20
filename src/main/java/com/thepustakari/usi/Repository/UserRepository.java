package com.thepustakari.usi.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thepustakari.usi.Model.UserInfo;
@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{
	

}
