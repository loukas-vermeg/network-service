package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hoststatus;

@Service
public interface nagios_hoststatusService {
	public List<nagios_hoststatus> getListnagios_hoststatus();

}
