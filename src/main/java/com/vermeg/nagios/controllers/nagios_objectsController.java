package com.vermeg.nagios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.nagios.entities.nagios_objects;
import com.vermeg.nagios.services.nagios_objectsService;

@RestController
@RequestMapping({"/nagios_objects"})
@CrossOrigin
public class nagios_objectsController {
	@Autowired
	private nagios_objectsService nagios_objectsService;
	@GetMapping("/list")
	 public List<nagios_objects> getAllnagios_objects() {
	 return nagios_objectsService.getListnagios_objects();
	 }
}
