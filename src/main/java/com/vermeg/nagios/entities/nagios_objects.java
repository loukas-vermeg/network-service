package com.vermeg.nagios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class nagios_objects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="object_id")
	private int object_id;
	@Column(name="name1")
	private String name1;
	@Column(name="name2")
	private String name2;
	
	
	public int getObject_id() {
		return object_id;
	}
	public void setObject_id(int object_id) {
		this.object_id = object_id;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	
	
}
