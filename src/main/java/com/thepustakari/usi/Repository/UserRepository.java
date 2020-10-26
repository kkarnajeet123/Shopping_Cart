package com.thepustakari.usi.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.thepustakari.usi.Model.UserInfo;
@Repository
public interface UserRepository extends CrudRepository<UserInfo, Integer>{
	

}
