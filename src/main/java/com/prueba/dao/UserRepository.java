package com.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
