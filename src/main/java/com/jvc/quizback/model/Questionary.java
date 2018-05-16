package com.jvc.quizback.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	private Integer idQuestionary;
	
	@Column(nullable = false)
	String name;
	
	@JoinColumn(name = FIELD_QUESTIONARY)
	@ManyToOne(fetch = FetchType.LAZY)
	private Course course;
	
	@ManyToMany
	@JoinTable (name="tagQuestionary", joinColumns= {@JoinColumn(name="idQuestionary")},
			   inverseJoinColumns= {@JoinColumn(name="idTag")})
	private List<Tag> tag;
	
	@ManyToMany
	@JoinTable (name="questionQuestionary", joinColumns= {@JoinColumn(name="idQuestionary")},
			   inverseJoinColumns= {@JoinColumn(name="idQuestion")})
	private List<Question> question;
}
