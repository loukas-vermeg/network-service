	package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_hostgroup_members;
import com.vermeg.nagios.services.nagios_hostgroup_membersService;

@RestController
@RequestMapping({"/nagios_hostgroup_members"})
@CrossOrigin
public class nagios_hostgroup_membersController {
	@Autowired
	private nagios_hostgroup_membersService nagios_hostgroup_membersService;
	@GetMapping("/list")
	 public List<nagios_hostgroup_members> getAllhostgroup_members() {
	 return nagios_hostgroup_membersService.getListhostgroup_members();
	 }
}
