package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_servicestatus;
import com.vermeg.nagios.repositories.nagios_servicestatusRepository;
import com.vermeg.nagios.services.nagios_servicestatusService;

@Service
public class nagios_servicestatusServiceImp implements nagios_servicestatusService{
	@Autowired
	private nagios_servicestatusRepository nagios_servicestatusRepository;
	@Override
	public List<nagios_servicestatus> getListnagios_servicestatus() {
		// TODO Auto-generated method stub
		return nagios_servicestatusRepository.findAll();
	}

}
