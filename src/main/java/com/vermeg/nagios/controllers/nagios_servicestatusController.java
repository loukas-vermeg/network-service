package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_servicestatus;
import com.vermeg.nagios.services.nagios_servicestatusService;

@RestController
@RequestMapping({"/nagios_servicestatus"})
@CrossOrigin
public class nagios_servicestatusController {
	@Autowired
	private nagios_servicestatusService nagios_servicestatusService;
	@GetMapping("/list")
	 public List<nagios_servicestatus> getAllnagios_servicestatus() {
	 return nagios_servicestatusService.getListnagios_servicestatus();
	 }
}
