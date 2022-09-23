package com.web.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="postdetails")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer p_Id;
	private String description;
	@ManyToOne
	@JoinColumn(name="uId")
	@JsonIgnore
	User user;
	public Integer getP_Id() {
		return p_Id;
	}
	public void setP_Id(Integer p_Id) {
		this.p_Id = p_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
