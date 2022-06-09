package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_servicestatus;

@Repository("nagios_servicestatusRepository")
public interface nagios_servicestatusRepository extends JpaRepository<nagios_servicestatus, Integer>{

}
