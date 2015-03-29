package com.example.form;

import java.util.Date;

public class EmployeeForm {

	Long id;
	String name;
	String sex;
	String email;
	String tel;
	// (name="entertime",nullable=false,updatable=false)
	// @Temporal(TemporalType.TIMESTAMP)
	// @Generated(GenerationTime.INSERT)
	Date enterTime;
	int grade;
	String department;
	String job;
	String ifwork;
	String age;
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

	String skills;

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
