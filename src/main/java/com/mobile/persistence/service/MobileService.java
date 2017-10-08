package com.mobile.persistence.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.persistence.entity.Mobile;
import com.mobile.persistence.repository.MobileRepository;

@Service
@Transactional(readOnly = true)
public class MobileService {

	@Autowired
	private MobileRepository mobileRepository;

	public Optional<Mobile> getById(Long id) {

		return mobileRepository.findById(id);
	}

	public List<Mobile> getAll() {

		return mobileRepository.findAll();
	}

	@Transactional
	public Mobile createMobile(final Mobile mobile) {

		setAuditableFields(mobile);

		mobileRepository.save(mobile);

		return mobile;
	}

	private void setAuditableFields(final Mobile mobile) {
		if (mobile.getId() == null) {
			mobile.setCreatedBy(1L);
			mobile.setCreatedDate(new Date());
		}
		mobile.setLastModifiedDate(new Date());
		mobile.setLastModifiedBy(1L);
	}

}
