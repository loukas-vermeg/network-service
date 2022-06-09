package com.vermeg.nagios.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class nagios_hostgroup_members {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int hostgroup_member_id;
private int hostgroup_id;
private int host_object_id;


public int getHostgroup_member_id() {
return hostgroup_member_id;
}
public void setHostgroup_member_id(int hostgroup_member_id) {
this.hostgroup_member_id = hostgroup_member_id;
}
public int getHostgroup_id() {
return hostgroup_id;
}
public void setHostgroup_id(int hostgroup_id) {
this.hostgroup_id = hostgroup_id;
}
public int getHost_object_id() {
return host_object_id;
}
public void setHost_object_id(int host_object_id) {
this.host_object_id = host_object_id;
}

@Override
public String toString() {
return "nagios_hostgroup_members [hostgroup_member_id=" + hostgroup_member_id + ", hostgroup_id=" + hostgroup_id
+ ", host_object_id=" + host_object_id + "]";
}


}