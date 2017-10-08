package com.mobile.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name = "mobile")
@SequenceGenerator(name = Mobile.SEQ_MOBILE, sequenceName = Mobile.SEQ_MOBILE, allocationSize = 1)
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer" })
public class Mobile extends AbstractAuditable {

	private static final long serialVersionUID = 3031921509139249855L;

	public static final String SEQ_MOBILE = "SEQ_MOBILE";

	@Id
	@GeneratedValue(generator = SEQ_MOBILE, strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	@Length(max = 256)
	private String name;

	@NotNull
	@Length(max = 256)
	private String colour;

	@NotNull
	@Length(max = 256)
	private String model;

	@NotNull
	@Length(max = 256)
	private String brand;

	@NotNull
	@Length(max = 256)
	private String os;
	
	@NotNull
	@Length(max = 256)
	private String imei;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	protected void setId(Long id) {

	}

}