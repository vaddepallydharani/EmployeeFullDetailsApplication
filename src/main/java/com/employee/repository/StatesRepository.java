package com.employee.repository;

import com.employee.model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends JpaRepository<States,Integer> {

    States findByStateId(Integer stateId);

}
