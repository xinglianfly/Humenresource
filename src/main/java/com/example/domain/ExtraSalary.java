package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExtraSalary {

	@Id
	@GeneratedValue
	Long id;
	@Column
	Long userid;
	@Column
	String name;
	@Column
	String cause;
	@Column
	double money;
	@Column
	Date time;
	@Column
	String month;
	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public ExtraSalary(){}
	

	public ExtraSalary(Long userid,String name, String cause, Double money, Date time,String month) {
		this.userid=userid;
		this.name = name;
		this.cause = cause;
		this.money = money;
		this.time = time;
		this.month=month;
	}


	public Long getUserid() {
		return userid;
	}


	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
