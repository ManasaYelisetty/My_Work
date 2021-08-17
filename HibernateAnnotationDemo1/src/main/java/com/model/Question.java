package com.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question1")

public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int question_id;
private String question_name;
@JoinTable(name="JoinedTable",joinColumns=@JoinColumn(name="questionID"),inverseJoinColumns=@JoinColumn(name="answer_id"))
@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="questionID")

private List<Answer> answers;
public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public String getQuestion_name() {
	return question_name;
}
public void setQuestion_name(String question_name) {
	this.question_name = question_name;
}
public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
public Question(int question_id, String question_name, List<Answer> answers) {
	super();
	this.question_id = question_id;
	this.question_name = question_name;
	this.answers = answers;
}
public Question() {
	
}
@Override
public String toString() {
	return "Question [question_id=" + question_id + ", question_name=" + question_name + ", answers=" + answers + "]";
}



}