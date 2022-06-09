package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_hostgroup_members;

@Repository("nagios_hostgroup_membersRepository")
public interface nagios_hostgroup_membersRepository extends JpaRepository<nagios_hostgroup_members,Integer>{

}
