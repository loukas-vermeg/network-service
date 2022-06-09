package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_services;
import com.vermeg.nagios.repositories.nagios_servicesRepository;
import com.vermeg.nagios.services.nagios_servicesService;

@Service
public class nagios_servicesServiceImp implements nagios_servicesService{
	@Autowired
	private nagios_servicesRepository nagios_servicesRepository;
	@Override
	public List<nagios_services> getListnagios_services() {
		// TODO Auto-generated method stub
		return nagios_servicesRepository.findAll();
	}

}
