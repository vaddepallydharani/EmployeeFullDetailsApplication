package com.employee.Controller;

import com.employee.model.States;
import com.employee.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/state")
@RestController
public class StateController {

    @Autowired
    StateService stateService;

    @GetMapping("/stateId")
    public States getDistrictsByStateId(@RequestParam Integer stateId){
        return stateService.getDistrictsByStateId(stateId);
    }
}
