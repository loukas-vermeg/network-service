package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hostgroups;

@Service
public interface nagios_hostgroupService {
	public List<nagios_hostgroups> getListHostgroup();
}
