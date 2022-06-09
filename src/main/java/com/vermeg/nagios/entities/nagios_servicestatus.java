package com.vermeg.nagios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class nagios_servicestatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="servicestatus_id")
	private int servicestatus_id;
	@Column(name="output")
	private String output;
	@Column(name="service_object_id")
	private int service_object_id;
	@Column(name="long_output")
	private String long_output;
	@Column(name="perfdata")
	private String perfdata;
	@Column(name="current_state")
	private int current_state;
	@Column(name="last_check")
	private Date last_check;
	@Column(name="next_check")
	private Date next_check;
	@Column(name="last_state_change")
	private Date last_state_change;
	@Column(name="last_time_ok")
	private Date last_time_ok;
	@Column(name="last_time_warning")
	private Date last_time_warning;
	@Column(name="last_time_unknown")
	private Date last_time_unknown;
	@Column(name="last_time_critical")
	private Date last_time_critical;
	@Column(name="problem_has_been_acknowledged")
	private int problem_has_been_acknowledged;
	@Column(name="acknowledgement_type")
	private int acknowledgement_type;
	
	
	public int getServicestatus_id() {
		return servicestatus_id;
	}
	public void setServicestatus_id(int servicestatus_id) {
		this.servicestatus_id = servicestatus_id;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public int getService_object_id() {
		return service_object_id;
	}
	public void setService_object_id(int service_object_id) {
		this.service_object_id = service_object_id;
	}
	public String getLong_output() {
		return long_output;
	}
	public void setLong_output(String long_output) {
		this.long_output = long_output;
	}
	public String getPerfdata() {
		return perfdata;
	}
	public void setPerfdata(String perfdata) {
		this.perfdata = perfdata;
	}
	public int getCurrent_state() {
		return current_state;
	}
	public void setCurrent_state(int current_state) {
		this.current_state = current_state;
	}
	public Date getLast_check() {
		return last_check;
	}
	public void setLast_check(Date last_check) {
		this.last_check = last_check;
	}
	public Date getNext_check() {
		return next_check;
	}
	public void setNext_check(Date next_check) {
		this.next_check = next_check;
	}
	public Date getLast_state_change() {
		return last_state_change;
	}
	public void setLast_state_change(Date last_state_change) {
		this.last_state_change = last_state_change;
	}
	public Date getLast_time_ok() {
		return last_time_ok;
	}
	public void setLast_time_ok(Date last_time_ok) {
		this.last_time_ok = last_time_ok;
	}
	public Date getLast_time_warning() {
		return last_time_warning;
	}
	public void setLast_time_warning(Date last_time_warning) {
		this.last_time_warning = last_time_warning;
	}
	public Date getLast_time_unknown() {
		return last_time_unknown;
	}
	public void setLast_time_unknown(Date last_time_unknown) {
		this.last_time_unknown = last_time_unknown;
	}
	public Date getLast_time_critical() {
		return last_time_critical;
	}
	public void setLast_time_critical(Date last_time_critical) {
		this.last_time_critical = last_time_critical;
	}
	public int getProblem_has_been_acknowledged() {
		return problem_has_been_acknowledged;
	}
	public void setProblem_has_been_acknowledged(int problem_has_been_acknowledged) {
		this.problem_has_been_acknowledged = problem_has_been_acknowledged;
	}
	public int getAcknowledgement_type() {
		return acknowledgement_type;
	}
	public void setAcknowledgement_type(int acknowledgement_type) {
		this.acknowledgement_type = acknowledgement_type;
	}
	
	
	
	
}
