package com.vermeg.nagios.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_hostgroups;

@Repository("nagios_hostgroupRepository")
public interface nagios_hostgroupRepository extends JpaRepository<nagios_hostgroups, Integer>{

}
