package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hostgroup_members;

@Service
public interface nagios_hostgroup_membersService {
	public List<nagios_hostgroup_members> getListhostgroup_members();
}
