package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_services;
@Service
public interface nagios_servicesService {
	public List<nagios_services> getListnagios_services();
}
