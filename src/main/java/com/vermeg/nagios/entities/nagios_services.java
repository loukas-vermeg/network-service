package com.vermeg.nagios.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class nagios_services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="service_id")
	private int service_id;
	@Column(name="host_object_id")
	private int host_object_id;
	@Column(name="service_object_id")
	private int service_object_id;
	@Column(name="display_name")
	private String display_name;
	
	
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public int getHost_object_id() {
		return host_object_id;
	}
	public void setHost_object_id(int host_object_id) {
		this.host_object_id = host_object_id;
	}
	public int getService_object_id() {
		return service_object_id;
	}
	public void setService_object_id(int service_object_id) {
		this.service_object_id = service_object_id;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	
	
	
}
