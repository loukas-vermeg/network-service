package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_hostgroups;
import com.vermeg.nagios.services.nagios_hostgroupService;


@RestController
@RequestMapping({"/hostgroups"})
@CrossOrigin
public class nagios_hostgroupController {
	@Autowired
	private nagios_hostgroupService hostgroupService;
	@GetMapping("/list")
	 public List<nagios_hostgroups> getAllhostgroups() {
	 return hostgroupService.getListHostgroup();
	 }
}
