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
public class Tag {
	@Id
	@GeneratedValue
	private Integer idTag;
	
	@Column(nullable = false)
	String name;
	
	@ManyToMany
	@JoinTable (name="tagQuestionary", joinColumns= {@JoinColumn(name="idTag")},
			   inverseJoinColumns= {@JoinColumn(name="idQuestionary")})
	private List<Questionary> questionary;
}
