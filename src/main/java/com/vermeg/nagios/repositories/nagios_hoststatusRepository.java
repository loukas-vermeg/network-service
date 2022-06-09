package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_hoststatus;
@Repository("nagios_hoststatusRepository")
public interface nagios_hoststatusRepository extends JpaRepository<nagios_hoststatus, Integer>{

}
