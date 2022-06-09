package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_hoststatus;
import com.vermeg.nagios.services.nagios_hoststatusService;

@RestController
@RequestMapping({"/nagios_hoststatus"})
@CrossOrigin
public class nagios_hoststatusController {
	@Autowired
	private nagios_hoststatusService nagios_hoststatusService;
	@GetMapping("/list")
	 public List<nagios_hoststatus> getAllhoststatus() {
	 return nagios_hoststatusService.getListnagios_hoststatus();
	 }
}
