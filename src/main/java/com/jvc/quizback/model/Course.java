package com.jvc.quizback.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Course {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy=Result.FIELD_COURSE)
	private List<Result> result;
}
