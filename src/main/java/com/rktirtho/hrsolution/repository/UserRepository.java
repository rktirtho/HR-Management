package com.rktirtho.hrsolution.repository;

import com.rktirtho.hrsolution.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}