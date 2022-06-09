package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_objects;
import com.vermeg.nagios.repositories.nagios_objectsRepository;
import com.vermeg.nagios.services.nagios_objectsService;

@Service
public class nagios_objectsServiceImp implements nagios_objectsService{
	@Autowired
	private nagios_objectsRepository nagios_objectsrepository;
	
	@Override
	public List<nagios_objects> getListnagios_objects() {
		// TODO Auto-generated method stub
		return nagios_objectsrepository.findAll();
	}

}
