package com.spring.repo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.spring.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public List<User> findByGender(String gender );
}
