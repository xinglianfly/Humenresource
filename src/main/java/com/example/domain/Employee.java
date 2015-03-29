package com.example.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	Long id;
	@Column
	String name;
	@Column
	String sex;
	@Column
	String email;
	@Column
	String tel;
	@Column
//	(name="entertime",nullable=false,updatable=false)
//	@Temporal(TemporalType.TIMESTAMP)
//	@Generated(GenerationTime.INSERT)
	Date enterTime;
	@Column
	int grade;
	@Column
	String department;
	@Column
	String job;
	@Column
	String ifwork;
	@Column
	String age;
	@Column
	String training;
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Column
	String skills;
	public Employee(){}
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int i) {
		this.grade = i;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getIfwork() {
		return ifwork;
	}

	public void setIfwork(String ifwork) {
		this.ifwork = ifwork;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
