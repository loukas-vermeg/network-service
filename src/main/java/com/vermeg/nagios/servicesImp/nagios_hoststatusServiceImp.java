package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hoststatus;
import com.vermeg.nagios.repositories.nagios_hoststatusRepository;
import com.vermeg.nagios.services.nagios_hoststatusService;

@Service
public class nagios_hoststatusServiceImp implements nagios_hoststatusService{
	@Autowired
	private nagios_hoststatusRepository nagios_hoststatusrepository;
	@Override
	public List<nagios_hoststatus> getListnagios_hoststatus() {
		// TODO Auto-generated method stub
		return nagios_hoststatusrepository.findAll();
	}

}
