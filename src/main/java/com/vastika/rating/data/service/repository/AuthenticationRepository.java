package com.vastika.rating.data.service.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vastika.rating.data.service.model.Authentication;
@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {

//	Authentication findByUserName(String username);
	
	
}
