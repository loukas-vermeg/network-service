package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hostgroups;
import com.vermeg.nagios.repositories.nagios_hostgroupRepository;
import com.vermeg.nagios.services.nagios_hostgroupService;
@Service
public class nagios_hostgroupServiceImp implements nagios_hostgroupService  {
	@Autowired
	private nagios_hostgroupRepository nagios_hgRepository;
	@Override
	public List<nagios_hostgroups> getListHostgroup() {
		// TODO Auto-generated method stub
		return nagios_hgRepository.findAll();
	}

}
