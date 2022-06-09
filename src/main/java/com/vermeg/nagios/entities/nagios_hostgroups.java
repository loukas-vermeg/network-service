package com.vermeg.nagios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class nagios_hostgroups {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="hostgroup_id")
	private int hostgroup_id;
	@Column(name="hostgroup_object_id")
	private int hostgroup_object_id;
	@Column(name="alias")
	private String alias;
	
	
	
	public int getHostgroup_id() {
		return hostgroup_id;
	}
	public void setHostgroup_id(int hostgroup_id) {
		this.hostgroup_id = hostgroup_id;
	}
	public int getHostgroup_object_id() {
		return hostgroup_object_id;
	}
	public void setHostgroup_object_id(int hostgroup_object_id) {
		this.hostgroup_object_id = hostgroup_object_id;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
}
