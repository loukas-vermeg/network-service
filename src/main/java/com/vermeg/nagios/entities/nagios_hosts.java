package com.vermeg.nagios.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class nagios_hosts {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int host_id;
private int host_object_id;
private String alias;
private String display_name;
private String address;


public int getHost_id() {
return host_id;
}
public void setHost_id(int host_id) {
this.host_id = host_id;
}
public int getHost_object_id() {
return host_object_id;
}
public void setHost_object_id(int host_object_id) {
this.host_object_id = host_object_id;
}
public String getAlias() {
return alias;
}
public void setAlias(String alias) {
this.alias = alias;
}
public String getDisplay_name() {
return display_name;
}
public void setDisplay_name(String display_name) {
this.display_name = display_name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
@Override
public String toString() {
return "nagios_host [host_id=" + host_id + ", host_object_id=" + host_object_id + ", alias=" + alias
+ ", display_name=" + display_name + ", address=" + address + "]";
}


}