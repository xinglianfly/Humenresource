package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BaseSalary {
	@Id
	@GeneratedValue
	Long id;
	@Column
	int grade;
	@Column
	Double basesalary;
	public BaseSalary(){}
	public BaseSalary(int grade, double basesalary) {
		this.grade = grade;
		this.basesalary = basesalary;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Double getBasesalary() {
		return basesalary;
	}
	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}
}
