package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Signone {
	@Id
	@GeneratedValue
	Long id;
	@Column
	Long userid;
	@Column
	Date date;
	@Column
	String ifsign;
	@Column
	String month;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getIfsign() {
		return ifsign;
	}

	public void setIfsign(String ifsign) {
		this.ifsign = ifsign;
	}

	public Signone() {
	}

	public Signone(Long userid, Date date) {
		this.userid = userid;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
