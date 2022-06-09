package com.vermeg.nagios.entities;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class nagios_hoststatus {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hoststatus_id;
	private int host_object_id;
	private Date status_update_time;
	private String output;
	private String long_output;
	private String perfdata;
	private int current_state;
	private Date last_check;
	private Date next_check;
	private Date last_state_change;
	private Date last_time_up;
	private Date last_time_down;
	private int problem_has_been_acknowledged;
	private int acknowledgement_type;


public int getHoststatus_id() {
return hoststatus_id;
}
public void setHoststatus_id(int hoststatus_id) {
this.hoststatus_id = hoststatus_id;
}
public int getHost_object_id() {
return host_object_id;
}
public void setHost_object_id(int host_object_id) {
this.host_object_id = host_object_id;
}
public Date getStatus_update_time() {
return status_update_time;
}
public void setStatus_update_time(Date status_update_time) {
this.status_update_time = status_update_time;
}
public String getOutput() {
return output;
}
public void setOutput(String output) {
this.output = output;
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
public Date getLast_time_up() {
return last_time_up;
}
public void setLast_time_up(Date last_time_up) {
this.last_time_up = last_time_up;
}
public Date getLast_time_down() {
return last_time_down;
}
public void setLast_time_down(Date last_time_down) {
this.last_time_down = last_time_down;
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
@Override
public String toString() {
return "nagios_hoststatus [hoststatus_id=" + hoststatus_id + ", host_object_id=" + host_object_id
+ ", status_update_time=" + status_update_time + ", output=" + output + ", long_output=" + long_output
+ ", perfdata=" + perfdata + ", current_state=" + current_state + ", last_check=" + last_check
+ ", next_check=" + next_check + ", last_state_change=" + last_state_change + ", last_time_up="
+ last_time_up + ", last_time_down=" + last_time_down + ", problem_has_been_acknowledged="
+ problem_has_been_acknowledged + ", acknowledgement_type=" + acknowledgement_type + "]";
}

}