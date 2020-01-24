package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "first")
	private String first;
	@Column(name = "age")
	private Integer age;

	public student() {
	}

	public student(Integer id, String first, Integer age) {
		this.id = id;
		this.first = first;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first=" + first + ", age=" + age + "]";
	}

}
