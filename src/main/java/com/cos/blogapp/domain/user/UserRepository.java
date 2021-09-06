package com.cos.blogapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer > {

	
	@Query( value = "select * from users where username = :username and password = :password", nativeQuery = true)
	Users mLogin(String username, String password);
}
