package com.vermeg.nagios.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vermeg.nagios.entities.nagios_hostgroup_members;
import com.vermeg.nagios.repositories.nagios_hostgroup_membersRepository;
import com.vermeg.nagios.services.nagios_hostgroup_membersService;

@Service
public class nagios_hostgroup_membersServiceImp implements nagios_hostgroup_membersService{
	@Autowired
	private nagios_hostgroup_membersRepository nagios_hostgroup_membersrepository;
	@Override
	public List<nagios_hostgroup_members> getListhostgroup_members() {
		// TODO Auto-generated method stub
		return nagios_hostgroup_membersrepository.findAll();
	}

}
