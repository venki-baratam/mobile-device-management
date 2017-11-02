package com.mobile.persistence.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.persistence.entity.User;
import com.mobile.persistence.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Optional<User> getById(Long id) {

		return userRepository.findById(id);
	}

	public List<User> getAll() {

		return userRepository.findAll();
	}

	@Transactional
	public User createUser(final User user) {
		
		setAuditableFields(user);
		
		userRepository.save(user);

		return user;
	}
	
	private void setAuditableFields(final User user) {
		if (user.getId() == null) {
			user.setCreatedBy(1L);
			user.setCreatedDate(new Date());
		}
		user.setLastModifiedDate(new Date());
		user.setLastModifiedBy(1L);
	}
}
