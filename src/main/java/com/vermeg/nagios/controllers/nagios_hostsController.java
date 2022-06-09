package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_hosts;
import com.vermeg.nagios.services.nagios_hostsService;

@RestController
@RequestMapping({"/nagios_hosts"})
@CrossOrigin
public class nagios_hostsController {
	@Autowired
	private nagios_hostsService nagios_hostsService;
	@GetMapping("/list")
	 public List<nagios_hosts> getAllhosts() {
	 return nagios_hostsService.getListnagios_hosts();
	 }
}
