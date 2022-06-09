package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hosts;

@Service
public interface nagios_hostsService {
	public List<nagios_hosts> getListnagios_hosts();
}
