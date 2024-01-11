package com.employee.service;

import com.employee.entity.AddressAndDOBEntity;
import com.employee.model.AddressAndDOB;
import com.employee.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressAndDOBServiceImpl implements AddressAndDOBService{

    @Autowired
    AddressRepository addressRepository;

    @Override
    public AddressAndDOBEntity saveAddressAndDOB(AddressAndDOBEntity addressAndDOBEntity, String empId) {

        addressAndDOBEntity.setEmpid(Integer.valueOf(empId));
        return addressRepository.save(addressAndDOBEntity);
    }

    @Override
    public AddressAndDOBEntity getAddress(Integer empId) {
        Optional<AddressAndDOBEntity> addressAndDOBEntityOptional = addressRepository.findByEmpid(empId);

        AddressAndDOBEntity addressAndDOBEntity = addressAndDOBEntityOptional.get();


        return addressAndDOBEntity;

    }
}
