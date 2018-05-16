package com.jvc.quizback.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Result {

	public static final String FIELD_COURSE = "course";

	@Id
	@GeneratedValue
	private Integer idResult;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@Column(nullable = false)
	private Integer calification;

	@JoinColumn(name = FIELD_COURSE)
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;

}