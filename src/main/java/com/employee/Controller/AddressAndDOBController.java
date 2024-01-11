package com.employee.Controller;

import com.employee.entity.AddressAndDOBEntity;
import com.employee.model.AddressAndDOB;
import com.employee.service.AddressAndDOBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressAndDOBController {

    @Autowired
    AddressAndDOBService addressAndDOBService;

    @PostMapping
    public AddressAndDOBEntity saveAddressAndDOB(@RequestHeader String empId, @RequestBody AddressAndDOBEntity addressAndDOBEntity){
        return addressAndDOBService.saveAddressAndDOB(addressAndDOBEntity, empId);
    }

    @GetMapping
    public AddressAndDOBEntity getAddress(@RequestParam Integer empId){
        return addressAndDOBService.getAddress(empId);
    }
}
