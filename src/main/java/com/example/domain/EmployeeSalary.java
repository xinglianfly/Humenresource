package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeSalary {

	@Id
	@GeneratedValue
	Long id;
	@Column
	Long userid;
	@Column
	String month;
	@Column
	double allmoney;
	@Column
	double extramoney;
	@Column
	double basesalary;
	
	public EmployeeSalary(){}
	public EmployeeSalary(Long userid, String month, double allmoney,
			double extramoney, double basesalary) {
		super();
		this.userid = userid;
		this.month = month;
		this.allmoney = allmoney;
		this.extramoney = extramoney;
		this.basesalary = basesalary;
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
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getAllmoney() {
		return allmoney;
	}
	public void setAllmoney(double allmoney) {
		this.allmoney = allmoney;
	}
	public double getExtramoney() {
		return extramoney;
	}
	public void setExtramoney(double extramoney) {
		this.extramoney = extramoney;
	}
	public double getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}
	
}
