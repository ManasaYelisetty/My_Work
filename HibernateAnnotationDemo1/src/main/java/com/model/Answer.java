package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answer1")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int answer_id;
private String answer_name;
private String postedBy;

@Override
public String toString() {
	return "Answer [answer_id=" + answer_id + ", answer_name=" + answer_name + ", postedBy=" + postedBy + "]";
}
public Answer(int answer_id, String answer_name, String postedBy) {
	super();
	this.answer_id = answer_id;
	this.answer_name = answer_name;
	this.postedBy = postedBy;
}
public Answer() {
	// TODO Auto-generated constructor stub
}
public int getAnswer_id() {
	return answer_id;
}
public void setAnswer_id(int answer_id) {
	this.answer_id = answer_id;
}
public String getAnswer_name() {
	return answer_name;
}
public void setAnswer_name(String answer_name) {
	this.answer_name = answer_name;
}
public String getPostedBy() {
	return postedBy;
}
public void setPostedBy(String postedBy) {
	this.postedBy = postedBy;
}


}
