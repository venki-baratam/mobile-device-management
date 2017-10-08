package com.mobile.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_mobile_map")
@SequenceGenerator(name = UserMobileMap.SEQ_USER_MOBILE_MAP, sequenceName = UserMobileMap.SEQ_USER_MOBILE_MAP, allocationSize = 1)
public class UserMobileMap extends AbstractAuditable {

	private static final long serialVersionUID = 9209154533843700496L;

	public static final String SEQ_USER_MOBILE_MAP = "SEQ_USER_MOBILE_MAP";

	@Id
	@GeneratedValue(generator = SEQ_USER_MOBILE_MAP, strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mobileId")
	private Mobile mobile;
	
	private Boolean assigned;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	protected void setId(Long id) {

	}

}