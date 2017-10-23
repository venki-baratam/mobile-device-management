package com.mobile.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

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
@Table(name = "mdm_user")
@SequenceGenerator(name = User.SEQ_USER, sequenceName = User.SEQ_USER, allocationSize = 1)
public class User extends AbstractAuditable {

	private static final long serialVersionUID = -953415528776948627L;

	public static final String SEQ_USER = "SEQ_MDM_USER";

	@Id
	@GeneratedValue(generator = SEQ_USER, strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	@Length(max = 100)
	private String name;
 
	@NotNull
	@Length(max = 10)
	private String mobile;

	@NotNull
	@Length(max = 100)
	private String email;

	@NotNull
	@Length(max = 256)
	private String address;

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(Long id) {
		// TODO Auto-generated method stub
		
	}

}
