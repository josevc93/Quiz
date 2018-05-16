package com.jvc.quizback.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	@Id
	@GeneratedValue
	private Integer idQuestion;
	
	@Column(nullable = false)
	String question;
	
	@ManyToMany
	@JoinTable (name="questionQuestionary", joinColumns= {@JoinColumn(name="idQuestion")},
			   inverseJoinColumns= {@JoinColumn(name="idQuestionary")})
	private List<Questionary> questionary;
}