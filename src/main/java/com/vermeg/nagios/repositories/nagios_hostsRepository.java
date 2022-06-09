package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_hosts;
@Repository("nagios_hostsRepository")

public interface nagios_hostsRepository extends JpaRepository<nagios_hosts, Integer>{

}
