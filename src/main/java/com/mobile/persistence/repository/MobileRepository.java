package com.mobile.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobile.persistence.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Long> {

}
