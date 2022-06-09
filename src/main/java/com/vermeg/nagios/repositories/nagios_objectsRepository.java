package com.vermeg.nagios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.nagios.entities.nagios_objects;

@Repository("nagios_objectsRepository")
public interface nagios_objectsRepository extends JpaRepository<nagios_objects, Integer>{

}
