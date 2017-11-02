package com.mobile.persistence.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.persistence.entity.Mobile;
import com.mobile.persistence.entity.UserMobileMap;
import com.mobile.persistence.repository.UserMobileMapRepository;

@Service
@Transactional(readOnly = true)
public class UserMobileMapService {

	@Autowired
	private UserService userService;

	@Autowired
	private MobileService mobileService;

	@Autowired
	private UserMobileMapRepository userMobileMapRepository;

	public Optional<UserMobileMap> getById(Long id) {

		return userMobileMapRepository.findById(id);
	}

	public List<Mobile> getAssgnedMobileByUserId(Long userId) {

		return userMobileMapRepository.getAssgnedMobileByUserId(userId);
	}

	public List<UserMobileMap> getAll() {

		return userMobileMapRepository.findAll();
	}

	@Transactional
	public UserMobileMap createUserMobileMap(final UserMobileMap userMobileMap) {

		if (userMobileMap.getUser() != null && userMobileMap.getUser().getId() != null)
			userMobileMap.setUser(userService.getById(userMobileMap.getUser().getId()).get());

		if (userMobileMap.getMobile() != null && userMobileMap.getMobile().getId() != null)
			userMobileMap.setMobile(mobileService.getById(userMobileMap.getMobile().getId()).get());

		setAuditableFields(userMobileMap);
		
		userMobileMapRepository.save(userMobileMap);

		return userMobileMap;
	}

	private void setAuditableFields(final UserMobileMap userMobileMap) {
		if (userMobileMap.getId() == null) {
			userMobileMap.setCreatedBy(1L);
			userMobileMap.setCreatedDate(new Date());
		}
		userMobileMap.setLastModifiedDate(new Date());
		userMobileMap.setLastModifiedBy(1L);
	}
}
