package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hosts;
import com.vermeg.nagios.repositories.nagios_hostsRepository;
import com.vermeg.nagios.services.nagios_hostsService;

@Service
public class nagios_hostsServiceImp implements nagios_hostsService{
	@Autowired
	private nagios_hostsRepository nagios_hostsrepository;
	@Override
	public List<nagios_hosts> getListnagios_hosts() {
		// TODO Auto-generated method stub
		return nagios_hostsrepository.findAll();
	}

}
