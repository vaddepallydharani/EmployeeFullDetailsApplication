package com.employee.service;

import com.employee.entity.AddressAndDOBEntity;
import com.employee.model.AddressAndDOB;

import java.util.Optional;

public interface AddressAndDOBService {

    public AddressAndDOBEntity saveAddressAndDOB(AddressAndDOBEntity addressAndDOBEntity, String empId);

    public AddressAndDOBEntity getAddress(Integer empId);
}
