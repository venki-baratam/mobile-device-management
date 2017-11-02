package com.mobile.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mobile.persistence.entity.Mobile;
import com.mobile.persistence.entity.UserMobileMap;

@Repository
public interface UserMobileMapRepository extends JpaRepository<UserMobileMap, Long> {

	@Query("select um.mobile from UserMobileMap um where um.assigned = true and um.user.id=:userId order by um.mobile.name")
	List<Mobile> getAssgnedMobileByUserId(Long userId);
}
