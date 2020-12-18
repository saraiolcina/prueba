package com.prueba.service;


import org.springframework.data.domain.*;
import java.util.*;
import com.prueba.entity.User;

public interface UserService {
	
	public Iterable<User> findAll();
	
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);

}
