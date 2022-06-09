package com.vermeg.nagios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_objects;
@Service
public interface nagios_objectsService {
	public List<nagios_objects> getListnagios_objects();
}
