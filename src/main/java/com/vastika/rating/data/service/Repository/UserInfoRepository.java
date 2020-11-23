package com.vastika.rating.data.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vastika.rating.data.service.model.UserInfo;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	
}
