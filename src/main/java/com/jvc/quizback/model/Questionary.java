package com.jvc.quizback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Questionary {
	public static final String FIELD_QUESTIONARY = "course";
	
	@Id
	@GeneratedValue
	private Integer idCourse;
	
	@Column(nullable = false)
	String name;
	
	@JoinColumn(name = FIELD_QUESTIONARY)
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;
}
