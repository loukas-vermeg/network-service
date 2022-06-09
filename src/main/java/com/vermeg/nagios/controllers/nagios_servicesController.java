package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_services;
import com.vermeg.nagios.services.nagios_servicesService;

@RestController
@RequestMapping({"/nagios_services"})
@CrossOrigin
public class nagios_servicesController {
	@Autowired
	private nagios_servicesService nagios_servicesService;
	@GetMapping("/list")
	 public List<nagios_services> getAllnagios_services() {
	 return nagios_servicesService.getListnagios_services();
	 }
}
