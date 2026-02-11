package com.om.restapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface humanRepository extends JpaRepository<Human, Integer> {

}
