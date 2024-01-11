package com.employee.repository;

import com.employee.entity.AddressAndDOBEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<AddressAndDOBEntity, Long> {

    Optional<AddressAndDOBEntity> findByEmpid(Integer empId);

}