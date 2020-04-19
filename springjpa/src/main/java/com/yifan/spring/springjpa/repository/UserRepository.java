package com.yifan.spring.springjpa.repository;

import com.yifan.spring.springjpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
