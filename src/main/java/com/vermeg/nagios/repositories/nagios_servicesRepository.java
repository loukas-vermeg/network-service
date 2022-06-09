package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_services;

@Repository("nagios_servicesRepository")
public interface nagios_servicesRepository extends JpaRepository<nagios_services, Integer>{

}
