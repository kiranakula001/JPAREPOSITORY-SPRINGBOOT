package com.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UserProfile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", location=" + location
				+ "]";
	}
	@Id
	@Column
	private int id;
	
	@Column private String name;
	
	@Column private int age;
	
	@Column private String gender;
	
	@Column private String location;
	public User() {}
	public User(int id, String name, int age, String gender, String location)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.location=location;
	}

}
