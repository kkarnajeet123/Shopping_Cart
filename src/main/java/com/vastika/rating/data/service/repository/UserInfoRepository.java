package com.vastika.rating.data.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vastika.rating.data.service.model.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	@Query(value="select * \r\n"
			+ " from user_info_tbl u\r\n"
			+ " inner join authentication_tbl au\r\n"
			+ " on u.authentication_authentication_id= au.authentication_id \r\n"
			+ " where au.username =?1", nativeQuery = true)
	UserInfo findByusername(String username);

	
}
