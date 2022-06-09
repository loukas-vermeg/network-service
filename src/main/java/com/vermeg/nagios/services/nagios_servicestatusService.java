package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_servicestatus;
@Service
public interface nagios_servicestatusService {
	public List<nagios_servicestatus> getListnagios_servicestatus();
}
