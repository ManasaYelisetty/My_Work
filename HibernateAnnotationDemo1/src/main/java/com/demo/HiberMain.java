package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Answer;
import com.model.Question;



public class HiberMain {
public static void main(String[] args) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	SessionFactory sfg=config.buildSessionFactory(); 
	Session session=sfg.openSession();
	
	Question que=new Question();
	que.setQuestion_name("Who founded Java");
	Answer ans=new Answer();
	ans.setAnswer_name("James Gosling");
	Answer ans1=new Answer();
	ans1.setAnswer_name("GreenTalk System");
	List<Answer> ls=new ArrayList<Answer>();
	ls.add(ans);
	ls.add(ans1);
	que.setAnswers(ls);
	session.save(que);
	Transaction tx=session.beginTransaction();
	tx.commit();
}
}
