package com.gulukal.project.oneToManyThree;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Student")
public class Student {
	
	
	@Id
	private int rollno;
	private String name;
	private int marks;
	
	
	@OneToMany   
	private List <Laptop> laptop =new ArrayList<>();
	
	
	

}
