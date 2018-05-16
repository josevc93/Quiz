package com.jvc.quizback.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Course {
	@Id
	@GeneratedValue
	private Integer idCourse;
	
	@Column(nullable = false)
	String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy=Result.FIELD_COURSE)
	private List<Result> result;
	
	@ManyToMany
	@JoinTable (name="userCourse", joinColumns= {@JoinColumn(name="idCourse")},
			   inverseJoinColumns= {@JoinColumn(name="idUser")})
	private List<User> user;
}
